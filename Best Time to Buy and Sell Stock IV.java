Q : You are given an integer array prices where prices[i] is the price of a given stock on the ith day, and an integer k.

    Find the maximum profit you can achieve. You may complete at most k transactions.
  
Ans : 
    class Solution {
    public int maxProfit(int k, int[] prices) {
        return f(0, 2*k, prices, new Integer[prices.length + 1][2*k + 1]);
    }
    private int f(int i, int k, int[] prices, Integer[][] dp){
        if(i == prices.length || k == 0) return 0;
        if(dp[i][k] != null) return dp[i][k];
        if(k%2 == 0)
            return dp[i][k] = Math.max(-prices[i] + f(i + 1, k - 1, prices, dp), f(i + 1, k, prices, dp));
        return dp[i][k] = Math.max(prices[i] + f(i + 1, k - 1, prices, dp), 0 + f(i + 1, k, prices, dp));
    }
}
