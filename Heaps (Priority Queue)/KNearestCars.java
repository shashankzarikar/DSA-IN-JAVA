/* We are given N points in 2D plane which are locations of N cars.
If we are at origin , print the nearest K cars.*/



import java.util.*;

public class KNearestCars {
    public static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;
        int idx;
        Point(int x, int y , int distSq,int idx){
            this.x=x;
            this.y=y;
            this.distSq=distSq;
            this.idx=idx;
        }
        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq;
        }

    }
    public static void main(String args[]){

        int arr[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
 
        /*
        
        //Approach 1:- store distances of all points from origin in priority queue and print first k points from priority queue  
        //Time Compleity =O(nlogn+klogn)
        PriorityQueue<Point> pq=new PriorityQueue<>();    //Min Heap

        for(int i=0;i<arr.length;i++){
            int distSq=arr[i][0]*arr[i][0]+arr[i][1]*arr[i][1];
            pq.add(new Point(arr[i][0],arr[i][1],distSq,i));
        }

        for(int i=0;i<k;i++){
            System.out.print("C"+pq.remove().idx+" ");
        }
            */
           
        // Appoach 2:- Optimised , Stored only k  points in priority queue and compare every point with it and if that point is nearest add it in priority queue  
        
        //O(n log k)
        
        PriorityQueue<Point> pq=new PriorityQueue<>(Collections.reverseOrder()); //Max Heap 

        int i=0;
        while(i<k){
            int distSq=arr[i][0]*arr[i][0]+arr[i][1]*arr[i][1];
            pq.add(new Point(arr[i][0],arr[i][1],distSq,i));
            i++;
        }

        while(i<arr.length){
            int distSq=arr[i][0]*arr[i][0]+arr[i][1]*arr[i][1];
            if(pq.peek().distSq > distSq){
                pq.remove();
                pq.add(new Point(arr[i][0],arr[i][1],distSq,i));
            }
            i++;
        }
        
        while(!pq.isEmpty()){
            System.out.print("C"+pq.remove().idx+" ");
        }

        
    }
    
}
