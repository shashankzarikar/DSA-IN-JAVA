// Convert a LL in the order :- L(1)->L(2)->L(3)->L(4)->L(5)->.......->L(n)-> null into 
// Zigzag order :- L(1)->L(n)->L(2)->L(n-1)->L(3)->L(n-2)->L(4)->L(n-3)......-> null

public class Zigzag {
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

        public void zigzag(Node head) {
            // Find mid
            Node slow = head;
            Node fast = head.next;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            // Slow is mid node
            Node righthead = slow.next;
            slow.next = null;
            // reverse second half
            Node prev = null;
            Node curr = righthead;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            righthead = prev;
            // merge alternately
            merge(head, righthead);
        }

        public void merge(Node head1, Node head2) {
            Node leftnext;
            Node rightnext;
            while (head1 != null && head2 != null) {
                leftnext = head1.next;
                rightnext = head2.next;

                head1.next = head2;
                head2.next = leftnext;
                head1 = leftnext;
                head2 = rightnext;
            }
        }

    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printLL();
        ll.zigzag(ll.head);
        ll.printLL();

    }
}
