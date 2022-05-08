Q : A top secret message containing letters from A-Z is being encoded to numbers using the following mapping:
    You are an FBI agent. You have to determine the total number of ways that message can be decoded, as the answer can be large return the answer modulo 109 + 7.
Ans :
    class Solution {
        static int mod = (int)1e9 + 7; 
        public int CountWays(String str){
            int n = str.length();
            if(n == 0) return 0;
            int[] dp = new int[n + 1];
            Arrays.fill(dp, -1);
            return f(0, str, dp);
        }
        private int f(int i, String s, int[] dp){
            if(i == s.length()) return 1;
            if(s.charAt(i) == '0') return 0;
            if(dp[i] != -1) return dp[i];
            int take = f(i + 1, s, dp);
            int no_take = 0;
            if(i < s.length() - 1 && Integer.parseInt(s.substring(i, i + 2)) <= 26)
                no_take = f(i + 2, s, dp);
            return dp[i] = (take + no_take)%mod;
        }
}
