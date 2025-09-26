public class LinkedList {
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

    // Methods

    // Add element add starting
    public void addFirst(int data) { // Time Complexity =O(1)
        // Step 1 :- Create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2 :- New Node = head
        newNode.next = head;
        // head=New Node
        head = newNode;
    }

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

    // Add element at given index
    public void addAtIndex(int idx, int data) { // Time complexity = O(n)
        if (idx == 0) {
            addFirst(data);
            return;
        }
        // Create new Node
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i=idx-1 (temp=previous node)
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // remove first element in LL
    public int removeFirst(){ // Time Complexity = O(1)
        if(size==0){
           System.out.println("LL is empty");
           return Integer.MIN_VALUE; 
        }
        else if(size==1){//Head and tail is same 
             int val=head.data;
             head=tail=null;
             size--;
             return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return size;
    }
    // remove last element in LL
    public int removeLast(){ // Time complexity = O(n)
        if(size==0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        //i=size-1 (previous Node)
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }


    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(4);
        ll.addLast(3);
        ll.printLL();
        System.out.println(ll.size);
        ll.addAtIndex(2, 6);
        ll.printLL();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.printLL();
        System.out.println(ll.size);
        ll.removeLast();
        ll.printLL();
        System.out.println(ll.size);


    }
}