public class SearchinLL {
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
    // Iterative search 
    public int iterativeSearch(int key){ //T.C =O(n)  S.C = O(1)
        Node temp=head;
        int idx=0;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }
            else {
                temp=temp.next;
                idx++;
            }
        }
        return -1;
    }
   
    // recursive Search approach 1 :-
    public int recursiveSearch(int key){ // TC=O(n)  SC =O(n)
        return helper(head,key,0);
      
    }
    public int helper(Node head,int key,int idx){
        //base case
          if(head==null){
            return -1;
        }
        //base case
        if(head.data==key){
            return idx;
        }

        head=head.next;
        return helper(head,key,idx+1);
    }
// Recursive search approach 2
    public int recursiveSearch2(int key){  // TC=O(n)  SC =O(n)
        return helper2(head,key);
    }
    public int helper2(Node head,int key){
        //Base case
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper2(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;

    }
}

    public static void main(String args[]){
        LinkedList ll=new LinkedList();
          ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.printLL();
        System.out.println(ll.iterativeSearch(1));
        System.out.println(ll.recursiveSearch(4));
        System.out.println(ll.recursiveSearch2(1));
        System.out.println(ll.head.data);




    }
    
}
