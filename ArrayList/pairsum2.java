/*  Problem:
# Find if any pair in a Sorted & Rotated ArrayList has a target sum.

#  Example:
# Input:  arr = [11, 15, 6, 8, 9, 10],  target = 16
# Output: True  (Because 6 + 10 = 16 is a valid pair)

# Note:
# The array is initially sorted and then rotated.
# Your task is to check if there's any such pair that adds up to the given target.*/ 

// Time Complexity = O(n)
import java.util.*;
public class pairsum2 {
    public static int findbreakpoint(ArrayList<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                return i;
            }
        }
        return -1;
    }
    //two pointer approach on rotated and sorted array
    public static boolean pairsum(ArrayList<Integer> list , int target){
        //Find the breaking point of array to initialise the pointers
        int breakpoint=findbreakpoint(list);
        //initialise pointers
        int lp=breakpoint+1;
        int rp=breakpoint;
        int n=list.size();
        while(lp!=rp){
            // case 1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            // case 2
            else if (list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }
            // case 3
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    // this is one more approach to avoid remembering that modulo formulas
    public static boolean pairsum2(ArrayList<Integer> list,int target){
          //Find the breaking point of array to initialise the pointers
        int breakpoint=findbreakpoint(list);
        //initialise pointers
        int lp=breakpoint+1;
        int rp=breakpoint;
        int n=list.size();
        while(lp!=rp){
            // case 1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            // case 2
            else if (list.get(lp)+list.get(rp)<target){
                if(lp==list.size()-1){
                    lp=0;
                }
                else{
                    lp++;
                }
            }
            // case 3
            else{
                if(rp==0){
                    rp=list.size()-1;
                }
                else{
                    rp--;
                }
            }
        }
        return false;

    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,15,6,8,9,10));
        System.out.println(pairsum(list,16));
       System.out.println(pairsum(list,16));

    }

    
}
