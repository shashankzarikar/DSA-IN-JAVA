public class CircularQueueImplementationArray {
    public static class Queue{
         int arr[];
         int size;
         int front;
         int rear;
        Queue(int n){
            arr=new int[n];
            size=n;
            front=-1;
            rear=-1;
        }
        //is Empty
        public  boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        //isFull
        public  boolean isFull(){
            return (rear+1)%size== front;  
        }
        //Add
        public  void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //Remove
        public  int remove(){
            if(isEmpty()){
                System.out.println("queue is empty!");
                return -1;
            }
            int val=arr[front];
            // if we are removing the last element, reset front and rear to -1

            if(front ==rear){
                front = rear=-1;
            }
            else{
               front =(front+1)%size;
            }
            
            return val;
        }
        //peek
        public  int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }
    public  static void main(String args[]){
          Queue q=new Queue(3);
           q.add(1);
           q.add(2);
           q.add(3);
           while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
           }
    }
    
}
