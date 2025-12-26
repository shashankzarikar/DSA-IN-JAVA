public class QueueImplementationLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        private Node head;
        private Node tail;
        private int size;

        // isEmpty
        public boolean isEmpty() { //TC =O(1)
            return head == null;
        }

        // add
        public void add(int data) {  //TC =O(1)
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                size++;
                return;
            }

            tail.next = newNode;
            tail = newNode;
            size++;

        }

        // Remove
        public int remove() {  //TC =O(1)
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            int val = head.data;

            if (head == tail) { // Single element
                head = tail = null;
            } else {
                head = head.next;
            }
            size--;
            return val;
        }

        // peek
        public int peek() {   //TC =O(1)
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.data;
        }

        public int getSize() {
            return size;
        }

    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(3);
        q.add(4);
        System.out.println(q.getSize());
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
        System.out.println(q.getSize());

    }

}
