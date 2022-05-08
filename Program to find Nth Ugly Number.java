class Solution {
    public int nthUglyNumber(int n) {
        if(n <= 0) return 0;
        if(n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        int cnt2 = 0, cnt3 = 0, cnt5 = 0;
        for(int i = 1; i <= n; i++){
            dp[i] = Math.min(dp[cnt2]*2, Math.min(dp[cnt3]*3, dp[cnt5]*5));
            if(dp[i]%2 == 0) cnt2++;
            if(dp[i]%3 == 0) cnt3++;
            if(dp[i]%5 == 0) cnt5++;
        }
        return dp[n - 1];
    }
}
