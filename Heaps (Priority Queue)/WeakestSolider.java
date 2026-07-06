import java.util.*;

public class WeakestSolider {

    static class Row implements Comparable<Row> {
        int soldiers;
        int idx;

        Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldiers == r2.soldiers) {
                return this.idx - r2.idx;
            } else {
                return this.soldiers - r2.soldiers;
            }
        }
    }

    public static void main(String ags[]) {

        int matrix[][] = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
        int k = 2;

        // Approach 1 :- brute force , insert all rows in pq (min-heap) and print first
        // k rows

        // TC=O(n*m)+O(nlogn)+O(k*logn)
        
        /*
        PriorityQueue<Row> pq = new PriorityQueue<>();

        for (int i = 0; i < matrix.length; i++) {
            int soldierCount = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    soldierCount++;
                } else {
                    break;
                }
            }
            pq.add(new Row(soldierCount, i));
        }
        System.out.println("Weakest Soldiers : ");
        for (int i = 0; i < k; i++) {
            System.out.print(" row " + pq.remove().idx);
        }
            */

        // Approach 2 :- Use PriorityQueue max heap if size k and keep only k rows in pq
        // and if weaker row found remove strongest row and add current row
        // and use binary search for finding soldier count instead of for loop

        PriorityQueue<Row> pq = new PriorityQueue<>(Collections.reverseOrder());

        int i = 0;

        while (i < k) {
            int soldierCount = countSoldiers(matrix[i]);
            pq.add(new Row(soldierCount, i));
            i++;
        }

        while (i < matrix.length) {
            int soldierCount = countSoldiers(matrix[i]);

            Row top = pq.peek();

            if (soldierCount < top.soldiers || soldierCount == top.soldiers && i < top.idx) {
                pq.remove(); 
                pq.add(new Row(soldierCount, i));
            }
            i++;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.remove().idx);
        }

        Collections.reverse(ans);

        for (int idx : ans) {
            System.out.print("row " + idx + " ");
        }
    }

    static int countSoldiers(int row[]) {
        int lo = 0;
        int hi = row.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (row[mid] == 1) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }
}
