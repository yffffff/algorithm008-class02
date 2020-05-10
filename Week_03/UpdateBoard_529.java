class UpdateBoard_529 {
    public char[][] updateBoard(char[][] board, int[] click) {
    	if (board[click[0]][click[1]] == 'M') {
    		board[click[0]][click[1]] = 'X';
    		return board;
    	}
        check(board , click[0], click[1]);
        return board;
    }

    public void check ( char[][] board, int x, int y ) {
        if ( y >= board[0].length || y < 0 || x >= board.length || x < 0 ) {
            return;
        }
        if (! check_detail(board , x ,y)){
            return;
        }
    	for (int i = -1; i <= 1; i++) {
    		for (int j = -1; j <= 1; j++) {
    			if (x + i >= 0 && x + i < board.length && y + j >= 0 && y + j < board[0].length && board[x + i][y + j] == 'E') {
    				check(board, x + i, y + j);
    			}
    		}
    	}
        return ;
    }

    public boolean check_detail(char[][]board, int x ,int y){
        int lei = 0;
        for ( int a = x-1 ; a <= x+1 ; a++){
            if ( a < 0 || a >= board.length ) {
                continue;
            }
            for ( int b = y-1 ; b <= y+1 ; b++ ){
                if ( b < 0 || b >= board[0].length ){
                    continue;
                }
                if ( board[a][b] == 'M'){
                    lei++;
                }
            }
        } 
        if ( lei == 0 ){
            board[x][y] = 'B';
            return true;
        }else{
            board[x][y] = Character.forDigit(lei, 10);
            return false;
        }
    }


}