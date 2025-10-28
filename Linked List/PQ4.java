//Odd Even Linked List
// We have a Linked List of integers ,write a function to
// modify the linked list such that all even numbers appear before all the odd
// numbers in the modified linkedlist.Also,keep the order of even and odd numbers same
public class PQ4 {
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

        public Node evenoddll() {
            Node evenhead = null;
            Node eventail = null;
            Node oddhead = null;
            Node oddtail = null;
            Node curr = head;
            while (curr != null) {
                Node next = curr.next;
                curr.next = null;
                if (curr.data % 2 == 0) {
                    if (evenhead == null) {
                        evenhead = eventail = curr;
                    } else {
                        eventail.next = curr;
                        eventail = curr;
                    }
                } else {
                    if (oddhead == null) {
                        oddhead = oddtail = curr;
                    } else {
                        oddtail.next = curr;
                        oddtail = curr;
                    }
                }
                curr = next;
            }
            eventail.next = oddhead;
            head = evenhead;
            return head;
        }
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addLast(8);
        ll.addLast(12);
        ll.addLast(10);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(6);
        ll.printLL();
        ll.evenoddll();
        ll.printLL();

    }
}
