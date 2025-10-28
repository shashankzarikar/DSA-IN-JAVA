/*
Question 1: Intersection of Two Linked Lists

In a system there are two singly linked lists. By some programming error,
the end node of one of the linked lists got linked to the second list,
forming an inverted Y-shaped list. Write a program to get the point where
the two linked lists merge.
*/

//Time Complexity= O(n*m)
//Space Complexity=O(1)
public class PQ1 { 

    public static class LinkedList {
        public static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public Node head;
        public Node tail;
        public int size;

        public void addLast(int data) {

            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;

            tail = newNode;
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

        public Node findintersection(Node head1, Node head2) {
            Node temp1 = head1;
            while (temp1 != null) {
                Node temp2 = head2;
                while (temp2 != null) {
                    if (temp1 == temp2) {
                        return temp1;
                    }
                    temp2 = temp2.next;
                }
                temp1 = temp1.next;
            }
            return null;
        }

    }

    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.addLast(4);
        l1.addLast(5);
        l2.addLast(1);
        l2.addLast(2);
        l2.addLast(3);
        l2.addLast(6);
        l1.tail.next = l2.head.next.next.next;
        l2.addLast(7);
        l1.printLL();
        l2.printLL();
        LinkedList.Node intersection = l1.findintersection(l1.head, l2.head);
        if(intersection!=null){
            System.out.println("Intersection at :" + intersection.data);
        }
        else{
            System.out.println("LL are not intersected");
        }

    }

}
