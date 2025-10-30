//Implementation of stack using arraylist
import java.util.ArrayList;

public class Stackimplementation {
    static class Stack {
        static ArrayList<Integer> list=new ArrayList<>();
        //is empty 
        public static boolean isempty(){
            return list.size()==0;
        }
        //Push
        public static void push (int data){
            list.add(data);
        }
        //Pop
        public static int pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //Peek
        public static int peek(){
            return list.get(list.size()-1);
        }
    }
public static void main(String args[]){
    Stack s= new Stack();
    System.out.println(s.isempty());
    s.push(1);
    s.push(2);
    s.push(3);
    while(!s.isempty()){
        System.out.println(s.peek());
        s.pop();
    }
}
}