/*You are given n items, where each item has a value and a weight. You are also given a knapsack of capacity W.
You are allowed to take fractions of items. Your task is to maximize the total value placed in the knapsack.
Find the maximum total value that can be obtained */

//Time Complexity=(nlogn)
//Space Complexity=O(n)
import java.util.*;

public class FractionalKnapsack {
    public static void main(String args[]) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int capacity = 50;

        final int VALUE = 0;
        final int WEIGHT = 1;
        final int RATIO = 2;
        
        double matrix[][] = new double[value.length][3];
        for (int i = 0; i < value.length; i++) {
            matrix[i][VALUE] = value[i];
            matrix[i][WEIGHT] = weight[i];
            matrix[i][RATIO] = (double) value[i] / weight[i];
        }
        
        //Sort matrix array according to ratio  
        Arrays.sort(matrix, Comparator.comparingDouble(o -> o[RATIO]));
        double totalvalue = 0;
        double remainingcapacity = capacity;
        //we want ratio in descending order but we sorted array in ascending order so iterate k from last index to 0
        for (int k = matrix.length-1; k>=0&& remainingcapacity > 0; k--) {
            if (matrix[k][WEIGHT] <= remainingcapacity) {
                totalvalue += matrix[k][VALUE];
                remainingcapacity -= matrix[k][WEIGHT];
            } else {
                totalvalue += (remainingcapacity * matrix[k][RATIO]);
                break;
            }
        }

        System.out.println("Maximum value =" + totalvalue);

    }

}
