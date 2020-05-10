class Solution {
    private List<List<String>> result = new ArrayList<>();
    int[] rrow;
    int[] mmm;
    int[] secondary;
    int[] queens;
    int n;
    public List<List<String>> solveNQueens(int n) {
        row = new int[n];
        mmm = new int[2*n-1];
        secondary = new int[2*n-1];
        queens = new int[n];
        this.n = n;
        backtrack(0);
        return result;
    }

    public void backtrack (int row){
        if ( row >= n ) 
            return ;
        for (int col=0; col < n ; col++){
            if (isNotUnderAttack(row,col)){
            placeQueen(row,col);
            if (row == n-1 ) addSolution();
            backtrack(row+1);
            removeQueen(row,col);
        } }
    }

    public boolean isNotUnderAttack(int row,int col){
        int res = rrow[col] + mmm[row - col + n - 1] + secondary[row + col];
        return res == 0;
    }

    public void placeQueen(int row,int col){
        queens[row] = col;
        rrow[col] = 1;
        mmm[row-col+n-1]=1;
        secondary[row+col] = 1;
    }

    public void removeQueen(int row,int col){
        queens[row] = 0;
        rrow[col] = 0;
        mmm[row-col+n-1] = 0;
        secondary[row+col] = 0;
    }

    public void addSolution() {
        List<String> solution = new ArrayList<String>();
        for (int i = 0; i < n; ++i) {
            int col = queens[i];
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < col; ++j) sb.append(".");
            sb.append("Q");
            for(int j = 0; j < n - col - 1; ++j) sb.append(".");
            solution.add(sb.toString());
        }
        result.add(solution);
    }
}