//Create a singly circular LL from stratch 
public class SinglyCircularLL {
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

    // Add at first
    public void addFirst(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            tail.next = head;
            return;
        }
        newnode.next = head;
        head = newnode;
        tail.next = head;

    }

    // Add Last
    public void addLast(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            tail.next = head;
            return;
        }
        tail.next = newnode;
        newnode.next = head;
        tail = newnode;
    }

    // add at index
    public void addAtIndex(int index, int data) {
        if (index > size) {
            System.out.println("Index out of bound");
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }

    // Remove first
    public int removeFirst() {
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if (head.next == null) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        size--;
        tail.next = head.next;
        head = head.next;
        return val;
    }

    // Remove last
    public int removeLast() {
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if (head.next == null) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = head;
        size--;
        return val;
    }

    // Remove from index
    public int removeFromIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index Invalid");
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == size - 1) {
            return removeLast();
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    // print CLL
 public void print() {
    if(head == null) {
        System.out.println("List is empty");
        return;
    }
    Node temp = head;
    do {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    } while(temp != head);
    System.out.println("(back to head)");
}

//search in LL
public int searchLL(int val){
    if(head==null){
        return -1;
    }
    Node temp=head;
    int idx=0;
    do {
        if(temp.data==val){
            return idx;
        }
        idx++;
        temp=temp.next;
    } while(temp!=head);
    return -1;
}


    public static void main(String args[]) {
        SinglyCircularLL ll = new SinglyCircularLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        // System.out.println(ll.removeFirst());
        // System.out.println(ll.removeLast());
        ll.addAtIndex(4, 6);
        ll.print();
        System.out.println(head.data);
        System.out.println(tail.data);
        System.out.println(size);
        System.out.println(ll.removeFromIndex(2));
        ll.print();
        System.out.println(head.data);
        System.out.println(tail.data);
        System.out.println(ll.searchLL(9));

    }

}
