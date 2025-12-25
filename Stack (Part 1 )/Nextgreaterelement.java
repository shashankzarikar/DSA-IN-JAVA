//Given an array of integers, for each element, find the next greater element to its right in the array. If no greater element exists, return -1 for that element.
// Time Complexity = O(n)
import java.util.*;
public class Nextgreaterelement {
    public static void nextgreater(int arr[],int nextgreater[]){
        Stack<Integer> s= new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() &&arr[s.peek()] <=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextgreater[i]=-1;
            }
            else{
                nextgreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        int nextgreater[]=new int[arr.length];
        nextgreater(arr,nextgreater);
        for(int i=0;i<nextgreater.length;i++){
            System.out.print(nextgreater[i]+" ");
        }
    }
    
}
