public class ReverseDLL {
    public static class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Add first
    public void addFirst (int data){
        Node newnode =new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    public void printDLL(){
    Node temp=head;
    System.out.print("null<->");
    while(temp!=null){
        System.out.print(temp.data+"<->");
        temp=temp.next;
    }
    System.out.print("null");
    System.out.println();
   }
   public void reverseDLL(){
    Node curr = head;
    Node prev=null;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        curr.prev=next;
        prev=curr;
        curr=next;
    }
    head=prev;
   }

}
public static void main(String args[]){
    DoublyLL dll = new DoublyLL();
    dll.addFirst(1);
    dll.addFirst(2);
    dll.addFirst(3);
    dll.addFirst(4);
    dll.addFirst(5);
    dll.printDLL();
    dll.reverseDLL();
    dll.printDLL();
}
}