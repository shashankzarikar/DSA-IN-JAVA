/*
Problem:
Given two integers N and K, construct the lexicographically smallest string of length N
consisting of lowercase English letters such that the numeric value of the string is K.
Time Complexity (TC):
O(N) — one pass to build the string and one pass to adjust characters.

Space Complexity (SC):
O(N) — space used by the StringBuilder to store the result.
*/

 
public class LexicographicallySmallestString {
    public static String findLexicographicallySmallest(int N,int K){
        StringBuilder str=new StringBuilder("");
        if(K<N || K>26*N){
           return str.toString();
        }
        for(int i=0;i<N;i++){
            str.append('a');
        }
        int remaining=K-N;
        for(int j=N-1;j>=0;j--){
           if(remaining==0){
            break;
           }
           
           if(remaining<=25){
            str.setCharAt(j,(char)('a'+remaining));
            break;
           }
           else{
               str.setCharAt(j,(char)('a'+25));  
               remaining-=25;
           }
           
         

        }
        return str.toString();
    }
    public static void main(String args[]){
        System.out.println(findLexicographicallySmallest(5,4));
    }
    
}
