//Given n non-negative integers representing an elevation map where the width of 
// each bar is 1, compute how much water it can trap after raining.
import java.util.*;
public class TrappingRainWater {

    //Time Complexity=O(n)
    //Space Complexity=O(n)
    public static int findtrappingwater(int heights[]){

        //Calculate leftmax index for each index
        Stack<Integer> s=new Stack<>();
        int leftMax[]=new int[heights.length]; 
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()]<=heights[i]){  
                s.pop();
            }
            if(s.isEmpty()){
                leftMax[i]=-1;
                s.push(i);
            }
            else{
                leftMax[i]=s.peek();
            }
        }

        //Calculate rightMax index for each 
        s=new Stack<>();
        int rightMax[]=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]<=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                rightMax[i]=-1;
                s.push(i);
            }
            else{
                rightMax[i]=s.peek();
            }
        }
        //Calculate total water trapped 
        int totalWater=0;
        for(int i=0;i<heights.length;i++){
            int currWater=0;
            if(leftMax[i]>=0 && rightMax[i]>=0){
              currWater=Math.min(heights[leftMax[i]],heights[rightMax[i]])-heights[i];
              totalWater+=currWater;
            }   
        }
        
        return totalWater;
    }

    //Time Complexity=O(n)
    //Space Complexity=O(1)
    public static int mostoptimised(int heights[]){
        int n=heights.length;
        int leftMax=heights[0];
        int rightMax=heights[n-1];
        int low=1;
        int high=n-2;
        int ans=0;
        while(low<=high){
            if(leftMax<rightMax){
                leftMax=Math.max(leftMax,heights[low]);
                ans+=(leftMax-heights[low]);
                low++;
            }
            else{
                rightMax=Math.max(rightMax,heights[high]);
                ans+=(rightMax-heights[high]);
                high--;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int heights[] = {6, 0, 5, 0, 4};


          System.out.println(findtrappingwater(heights));
          System.out.println(mostoptimised(heights));
    }
    
}
