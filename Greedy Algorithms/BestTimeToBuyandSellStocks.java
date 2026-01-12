/*Best Time to Buy and Sell Stock
You are given an array prices[] where prices[i] is the price of a stock on the i-th day.
You want to maximize your profit by choosing one day to buy and one later day to sell.
Return the maximum profit you can achieve.
If no profit is possible, return 0.
Time Complexity=O(n)
Space Complexity=O(1)

*/
public class BestTimeToBuyandSellStocks {
    public static int maxprofit(int arr[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (buyprice > arr[i]) {
                buyprice = arr[i];
            } else {
                int currprofit = arr[i] - buyprice;
                maxprofit = Math.max(maxprofit, currprofit);

            }

        }
        return maxprofit;
    }

    public static void main(String args[]) {
        int arr[] = { 7, 6, 4, 3, 1 };
        System.out.println(maxprofit(arr));
    }

}
