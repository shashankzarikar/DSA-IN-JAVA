public class RemoveCycle {
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
        public static int size;

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

        // detect cycle
        public boolean isCycle() {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }

        public void removeCycle() {
            // detect cycle Node slow = head;
            Node fast = head;
            Node slow = head;
            boolean iscycle =false;
            while (fast != null && fast.next != null) {
                slow = slow.next;//+1
                fast = fast.next.next;//+2
                if (slow == fast) {
                    iscycle=true;
                    break;
                }
            }
            if(iscycle==false){
                return;
            }
            //Find starting point of loop and its previous node
            slow=head;
            Node prev=null;
            
            while(slow!=fast){
                prev=fast;
                slow=slow.next;//+1
                fast=fast.next;//+1
            }
            //assign prev.next = null to remove loop
            prev.next=null;

        }


    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.head = new LinkedList.Node(1);
        ll.head.next = new LinkedList.Node(2);
        ll.head.next.next=new LinkedList.Node(3);
        ll.head.next.next.next=ll.head.next;
        System.out.println(ll.isCycle());
        ll.removeCycle();
        ll.printLL();
        System.out.println(ll.isCycle());

        

    }

}
