public class RemoveNthNodefromLast {
     public static class LinkedList {
        public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
     public void addFirst(int data) { 
      
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
       
        newNode.next = head;
        
        head = newNode;
    }
     public void printLL() { 
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    //Remove nth Node from last
    public void removeNthnode(int n){

        //Find size of LL
        int sz=0;
        Node temp=head; 
        while(temp!=null){
            sz++;
            temp=temp.next;
        }
        //If removing the head
        if(n==sz){
         head=head.next;
         return;
        }
        //Nth Node from last is (size-n+1) th node from starting
        int itoFind=sz-n;
        int j=1;
        Node prev=head;
        while(j<itoFind){
            prev=prev.next;
            j++;
        }
        prev.next=prev.next.next;
        return;
    }
    
}
public static void main(String args[]){
    LinkedList ll =new LinkedList();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);
    ll.printLL();
    ll.removeNthnode(2);
    ll.printLL();
    System.out.println(ll.head.data);
}
}
