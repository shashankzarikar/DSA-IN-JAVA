//Question 2 :Delete N Nodes After M Nodes of a Linked List
//Wehave a linked list and two integers M and N.Traverse the linked list such that you 
//retain M nodes then delete next N nodes,continue the same till end of the linkedlist.
//Sample Input 1: M=2 N=2    LL: 1->2->3->4->5->6->7->8  Sample Output 1: 1->2->5->6
public class PQ2 {
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

       // Add element at ending
    public void addLast(int data) { // Time Complexity =O(1)
        // Step 1:- Create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2:- tail's next = newnode
        tail.next = newNode;
        // Step 3 :- tail = newNode
        tail = newNode;
    }

    // print linked list
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
   
  
  
     public void removeNandM(int m, int n){
        if (head == null || n == 0) return;
        if (m == 0) { // remove all nodes
            head = tail = null;
            size = 0;
            return;
        }

        Node curr = head;
        while (curr != null) {
            // skip m-1 nodes to land on the m-th node
            for (int i = 1; i < m && curr != null; i++) {
                curr = curr.next;
            }
            if (curr == null) break;

            // delete next n nodes
            Node temp = curr.next;
            for (int j = 0; j < n && temp != null; j++) {
                temp = temp.next;
                size--; // decrement for each removed node
            }
            // link retained part to the remainder
            curr.next = temp;
            if (temp == null) tail = curr;
            curr = temp;
        }
    }
}
public static void main(String args[]){
    LinkedList ll = new LinkedList();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(6);
    ll.addLast(7);
    ll.addLast(8);
    ll.printLL();
    ll.removeNandM(2,2);
    ll.printLL();
    System.out.println(ll.size);

}  
}
