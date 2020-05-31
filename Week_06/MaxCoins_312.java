class MaxCoins_312 {
 public int maxCoins(int[] nums) {
    int n = nums.length;
    int[] idx = new int[n + 2];
    idx[0] = idx[n + 1] = 1;
    for (int i = 1; i <= n; i++) {
        idx[i] = nums[i - 1];
    }
    int[][] dp = new int[n + 2][n + 2];
    for (int i = n; i >= 0; i--) {
        for (int j = i + 1; j < n + 2; j++) {
            for (int k = i + 1; k < j; k++) {
                dp[i][j] = Math.max(dp[i][j],dp[i][k] + dp[k][j] + idx[i]*idx[j]*idx[k]);
            }
        }
    }
    return dp[0][n + 1];
}}
