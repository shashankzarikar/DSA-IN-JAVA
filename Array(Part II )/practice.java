public class practice {

    public static void main(String args[]) {
        int prices[]={ 7, 1, 5, 3, 6, 4 };
        int maxprofit=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++) {
            if(buy <prices[i]) {
                int profit=prices[i]-buy;
                maxprofit=Math.max(maxprofit,profit);
            }
            else {
                buy=prices[i];
            }
        }
        System.out.println(maxprofit);
    

    }

}
