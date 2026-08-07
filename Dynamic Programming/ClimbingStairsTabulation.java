//Problem :- You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

public class ClimbingStairsTabulation {
   public static int climb(int n) {
    if (n == 0) return 1;
    int[] ways = new int[n + 1];
    ways[0] = 1;
    ways[1] = 1;
    for (int i = 2; i <= n; i++) {
        ways[i] = ways[i-1] + ways[i-2];
    }
    return ways[n];
}

public static void main(String[] args) {
    int n = 5;
    System.out.println("Total ways to reach nth stair is " + climb(n));
}
    
}
