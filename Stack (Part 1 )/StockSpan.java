import java.util.*;

public class StockSpan {
    public static void findstockspan(int stocks[], int spans[]) {
        Stack<Integer> s = new Stack<>();
        spans[0] = 1;
        s.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int currprice = stocks[i];
            while (!s.isEmpty() && currprice > stocks[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                spans[i] = i + 1;
            } else {
                spans[i] = i - s.peek();
            }
            s.push(i);
        }

    }

    public static void main(String args[]) {
        int stocks[] = { 100, 60, 65, 70, 75, 80, 100 };
        int spans[] = new int[stocks.length];
        findstockspan(stocks, spans);
        for (int i = 0; i < spans.length; i++) {
            System.out.print(spans[i] + " ");
        }

    }

}
