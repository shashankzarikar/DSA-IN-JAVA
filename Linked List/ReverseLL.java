public class ReverseLL {
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
    
     public void addFirst(int data) { // Time Complexity =O(1)
        // Step 1 :- Create new Node
        Node newNode = new Node(data);
      
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2 :- New Node = head
        newNode.next = head;
        // head=New Node
        head = newNode;
    }
     public void printLL() { // Time Complexity =O(n)
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

    public void reverseLL(){ // Time Complexity = O(n)
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    
}

public static void main(String args[]){
    LinkedList ll=new LinkedList();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);
    ll.printLL();
    ll.reverseLL();
    ll.printLL();

}
}
