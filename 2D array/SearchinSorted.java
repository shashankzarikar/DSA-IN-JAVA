import java.util.*;
// if n =no. of rows 
// m =no. of columns 
// if n>>m Time complexity is O(n)
// if m>>n Time Complexity is O(m)
// time complexity is O(n+m)

public class SearchinSorted {
    public static void Search(int matrix[][], int key) {
        int StartRow = 0;
        int StartCol = matrix[0].length - 1;
        while (StartRow < matrix.length && StartCol >= 0) {
            if (matrix[StartRow][StartCol] == key) {
                System.out.println("Key is found at (" + StartRow + "," + StartCol + ")");
                return;
            }
            if (key < matrix[StartRow][StartCol]) {
                StartCol--;
            } else {
                StartRow++;
            }
        }
        System.out.println("Key not found");

    }

    public static void main(String args[]) {
        int matrix[][] = { { 10, 20, 30, 40 },
                           { 15, 25, 35, 45 },
                           { 27, 29, 37, 48 },
                           { 32, 33, 39, 50 } };
        System.out.println("Enter the key");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        Search(matrix, key);

    }

}
