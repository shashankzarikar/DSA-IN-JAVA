/*You are given two integers L and R representing a range of integers from L to R (inclusive), and an integer K.
Your task is to find the Kth largest odd number within this range.If the value of K is greater than the total number
 of odd numbers present in the range [L, R], return 0. 
 Time Complexity=O(1)
 Time Complexity=O(1)
 */
public class KthLargestOddNumberInRange{
    public static int KthLargest(int L, int R,int K){
        int firstlargest=(R%2!=0) ? R :R-1;
        int KthLargest=firstlargest-2*(K-1);

        if(KthLargest<L){
            return 0;
        }
        else{
            return KthLargest;
        }
    }
    public static void main(String args[]){
        System.out.println(KthLargest(-3,3,1));
    }

}