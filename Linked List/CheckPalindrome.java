public class CheckPalindrome {
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
    //Slow-Fast approach  
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next; // +1
            fast=fast.next.next;// +2
        }
        return slow; // Slow is mid node 
    }

    public boolean checkpalindrome(){
        //base case
        if(head==null || head.next == null){
            return true;
        }
        //Step 1 :- Find mid node
        Node mid = findMid(head);
        //Step 2 :- reverse second half
        Node prev=null;
        Node curr=mid;
        Node next;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right = prev; //right half head ,  when curr become null prev is at last node so it is our right half's head now 
        Node left=head; // left half head

        //Step 3:- Check right half and left half are same or not  
        while (right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right .next;
        }
        return true;



    }

    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println(ll.checkpalindrome());


    }
}
