You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
  
  
  class Solution {
    static int climb_rec(int n, int[] dp){ 
       if(dp[n] != -1) return dp[n]; 
       if (n <= 1) return 1;
       return dp[n] = climb_rec(n - 1, dp) + climb_rec(n - 2, dp);
    }
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return climb_rec(n, dp);
    }
}
