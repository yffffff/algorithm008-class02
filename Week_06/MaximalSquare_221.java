class MaximalSquare_221 {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return 0;
        }
        int max_size = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];
        for (int i = 0; i <= row - 1 ; i++ ){
            for ( int j = 0;j <= col - 1 ; j++){
                if ( matrix[i][j] == '1'){
                    if (i == 0 || j == 0){
                        dp[i][j] = 1;
                    }else{
                        dp[i][j] = Math.min(dp[i-1][j] , Math.min(dp[i][j-1] ,dp[i-1][j-1])) + 1;
                    }
                }
                max_size = Math.max(dp[i][j] ,max_size);
            }
        }
        return max_size*max_size;
    }
}