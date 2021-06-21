package huaweiLC;

/**
 * <h3>leetcode</h3>
 * <p>被围绕的区域</p>
 *
 * @author : 张严
 * @date : 2021-06-17 17:21
 **/
public class No130 {
    public void solve(char[][] board) {
        if(board==null||board.length==0) return;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean isEdge = i==0||j==0||i==board.length-1||j==board[0].length-1;
                if(isEdge&&board[i][j]=='O') dfs(board, i, j);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]=='O') board[i][j] = 'X';
                if(board[i][j]=='#') board[i][j] = 'O';
            }
        }
    }

    private void dfs(char[][] board, int r, int c){
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]=='X'||board[r][c]=='#') return;
        board[r][c] = '#';
        dfs(board, r-1, c);
        dfs(board, r+1, c);
        dfs(board, r, c-1);
        dfs(board, r, c+1);
    }
}
