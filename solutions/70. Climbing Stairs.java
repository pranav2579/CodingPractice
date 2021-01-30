class Solution {
    public int climbStairs(int n) {
        // f(n) = f(n-1) + f(n-2)
        int[] dp = new int[n+3];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
    }
}
