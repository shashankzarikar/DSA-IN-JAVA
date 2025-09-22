public class DiagonalSum {
    // this method is not optimised as its Time Complexiy is O(n^2)
    public static int DiagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // Primary Diagonal Condition is i==j
                if (i == j) {
                    sum += matrix[i][j];
                }
                // Secodary diagonal condition is i+j=matrix.length-1
                else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }

            }
        }
        return sum;
    }

    public static int optimisedCodeForDiagonalSum(int matrix[][]) {
        // This is optimised solution because its time complexity is O(n)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // Primary Diagonal
            sum += matrix[i][i];
            // Secondary Diagonal
            // i+j=matrix.length-1;
            // j=matrix.length-1-i;
            if (i != matrix.length-1-i) {// if condition to avoid repeat adding of common diagonal element
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.println("Total Diagonal sum is " + DiagonalSum(matrix));
        System.out.println("Total Diagonal sum is " + optimisedCodeForDiagonalSum(matrix));

    }

}
