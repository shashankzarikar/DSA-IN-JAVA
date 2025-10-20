public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Add first
    public void addFirst (int data){
        Node newnode =new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
   // Add Last 
   public void addLast(int data){
    Node newnode=new Node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
    tail.next=newnode;
    newnode.prev=tail;
    tail=newnode;
   }
   //print DLL
   public void printDLL(){
    Node temp=head;
    System.out.print("null<->");
    while(temp!=null){
        System.out.print(temp.data+"<->");
        temp=temp.next;
    }
    System.out.print("null");
    System.out.println();
   }

   //Remove from last
   public int removeLast(){
    if(size==0){
        System.out.println("DLL is empty");
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val=head.data;
        head=tail=null;
        size--;
        return val;
    }
    int val=tail.data;
    tail=tail.prev;
    tail.next=null;
    size--;
    return val;
   }
   //Remove from first
   public int removeFirst(){
    if(size==0){
        System.out.println("DLL is empty");
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val=head.data;
        head=tail=null;
        size--;
        return val ;
    }
    int val=head.data;
    head=head.next;
    head.prev=null;
    size--;
    return val;
   }

   public static void main(String args[]){
    DoublyLL dll = new DoublyLL();
   dll.addFirst(1);
   dll.addFirst(2);
    dll.addLast(6);
    dll.addLast(4); 
    dll.printDLL();
    System.out.println( dll.removeLast());
    System.out.println(dll.removeFirst());
     dll.printDLL();
     System.out.println(dll.tail.data);
     System.out.println(dll.head.data);
   }

    
}
