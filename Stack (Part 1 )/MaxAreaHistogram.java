/*Max Area in Histogram

Given an array heights[] of non-negative integers where each element represents the height of a bar in a histogram 
and the width of each bar is 1, find and return the area of the largest rectangle that can be formed inside the histogram.
Input:  heights = [2, 1, 5, 6, 2, 3]
Output: 10
*/

//Time Complexity=O(n)
//Space Complexity=O(n)
import java.util.*;
public class MaxAreaHistogram {
    public static int calcMaxArea(int heights[]){
        //Calculate leftside minimum index for each index
        Stack<Integer> s = new Stack<>();
        int lsm[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                lsm[i]=-1;
            }
            else{
                lsm[i]=s.peek();
            }
            s.push(i);
        }

        //Calculate right side minimum index for each index
        s=new Stack<>();
        int rsm[]= new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                rsm[i]=heights.length;
            }
            else{
                rsm[i]=s.peek();
            }
            s.push(i);
        }
        //calculate area for each index and compare with max index
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int width=rsm[i]-lsm[i]-1;
            int currArea=height*width;

            maxArea=Math.max(maxArea,currArea);

        }
        return maxArea;
    }
    public static void main(String args[]){
        int heights[]={2,4};
        System.out.println(calcMaxArea(heights));

    }
    
}
