/*Maximum Balanced String Partitions You are given a string str of length N consisting only of characters 'L' and 'R'.
The string is guaranteed to have an equal number of 'L' and 'R'.A string is called balanced if the number of 'L' characters
 is equal to the number of 'R' characters. Your task is to find the maximum number of balanced substrings that can be obtained
  by partitioning the given string into contiguous substrings.
  
  Time Complexity=O(n)
  Space Complexity=O(1)
  */
public class MaximumBalancedStringPartition {
    public static void main(String args[]){
        String str="LRRRRLLRLLRL";
        int partition=0;

        int balance=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='L'){
                balance++;
            }
            else{
                balance--;
            }
            if(balance==0){
                partition++;
            }
        }

        System.out.println("Maxmimum Balanced parititons can be : "+partition);
    }
    
}
