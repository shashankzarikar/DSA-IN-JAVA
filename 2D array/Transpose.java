public class Transpose {
    public static void PrintMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int[][]matrix= { {2,3,7}, 
                         {5,6,7} };
        int transpose[][]=new  int [matrix[0].length][matrix.length];

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                transpose[j][i]=matrix[i][j];
            }
        }
        PrintMatrix(transpose);


    }
    
}
