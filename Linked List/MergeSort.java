import java.util.LinkedList;

public class MergeSort {
    public static class LinkedList {
        public static class Node {
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

        public Node findMid(Node head) {
            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;

        }

        private Node merge(Node head1, Node head2) {
            Node mergeLL = new Node(-1);
            Node temp = mergeLL;

            while (head1 != null && head2 != null) {
                if (head1.data <= head2.data) {
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                } else {
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                }
            }
            while (head1 != null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while (head2 != null) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            return mergeLL.next;
        }

        public Node mergesort(Node head) { // Time Complexity =O(nlogn)
            if (head == null || head.next == null) {
                return head;
            }
            // Find mid
            Node mid = findMid(head);
            // mergesort
            Node righthead = mid.next;
            mid.next = null;
            Node newleft = mergesort( head);
            Node newright = mergesort(righthead);
            return merge(newleft, newright);

        }
    }

    public static void main(String args[]) {
        LinkedList ll=new LinkedList ();
        ll.addFirst(6);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(4);
       
        ll.printLL();
        ll.head= ll.mergesort(ll.head);
        ll.printLL();


    }

}
