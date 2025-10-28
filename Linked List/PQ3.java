/*
Question 3: Swapping Nodes in a Linked List

We have a linked list and two keys in it, swap nodes for two given keys.
Nodes should be swapped by changing links. Swapping data of nodes may be
expensive in many situations when data contains many fields. It may be
assumed that all keys in the linked list are distinct.

Sample Input 1 : 1->2->3->4, x = 2, y = 4
Sample Output 1 : 1->4->3->2
*/

// Time complexity = O(n)
// Space complexity = O(1)
public class PQ3 {
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

        public void swapxandy(int x, int y) {
            if (x == y) {
                return;
            }
            Node xnode = head;
            Node xprev = null;
            while (xnode != null && xnode.data != x) {
                xprev = xnode;
                xnode = xnode.next;
            }
            Node ynode = head;
            Node yprev = null;
            while (ynode != null && ynode.data != y) {
                yprev = ynode;
                ynode = ynode.next;
            }
            if (xnode == null || ynode == null) {
                return;
            }
            if (xprev != null) {
                xprev.next = ynode;
            } else { // xprev is null means xnode is head
                head = ynode;
            }
            if (yprev != null) {
                yprev.next = xnode;
            } else {// yprev is null means ynode is head
                head = xnode;
            }
            
            //swap next pointer of x and y woth each other
            Node temp = xnode.next;
            xnode.next = ynode.next;
            ynode.next = temp;
        }

        public static void main(String args[]) {
            LinkedList ll = new LinkedList();
            ll.addLast(1);
            ll.addLast(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.printLL();
            ll.swapxandy(2, 4);
            ll.printLL();
        }
    }
}
