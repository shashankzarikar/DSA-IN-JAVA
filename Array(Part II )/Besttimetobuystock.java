public class Besttimetobuystock {

    public static void Siranswer(int prices[]) {
        int buyingprice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyingprice < prices[i]) {
                int profit = prices[i] - buyingprice;
                MaxProfit = Math.max(MaxProfit, profit);
            } else {
                buyingprice = prices[i];
            }
        }
        System.out.println("The max Profit we can achieve from this transaction is "+MaxProfit);

    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
       
        Siranswer(prices);

    }

}
