public class PQ1 {
    // Time Complexity = O(n^2)
    public static int frequency(int matrix[][],int key){
        int frequency=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++) {
                if (key ==matrix[i][j]) {
                    frequency++;
                }
            }
        }
        return frequency;
    } 
    public static void main(String args[]) {
        int matrix[][]= {{4,7,8},{8,8,7}};
        int key =4;
        System.out.println("Frequency of key is "+frequency(matrix,key));
    }
    
}
