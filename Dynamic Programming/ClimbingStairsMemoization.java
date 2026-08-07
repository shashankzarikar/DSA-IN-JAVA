//Problem :- You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

import java.util.*;

public class ClimbingStairsMemoization{
     public static int climbMemoization(int n, int stair[]){

        if(n==0){
           return 1;
        }
        if(n<0){
            return 0;
        }
        if(stair[n]!=-1){
            return stair[n];
        }
        int count1=climbMemoization(n-1,stair);
        int count2=climbMemoization(n-2,stair);

        stair[n]=count1+count2;

        return stair[n];
    }
    
    public static void main(String args[]) {
        int n=8;
        int stair[]=new int[n+1];
        Arrays.fill(stair, -1);

         System.out.println(climbMemoization(n,stair));   
     }

    
}