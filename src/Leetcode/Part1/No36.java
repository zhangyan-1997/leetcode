package Leetcode.Part1;

/**
 * <h3>leetcode</h3>
 * <p>有效的数独</p>
 *
 * @author : 张严
 * @date : 2021-04-22 22:07
 **/
public class No36 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            int[] judge = new int[9];
            for (int j = 0; j < 9; j++) {
                int c = board[i][j]-'0';
                if(c<=9&&c>=1) {
                    if(judge[c-1]!=0) return false;
                    judge[c-1] = 1;
                }
            }
        }
        
        for (int i = 0; i < 9; i++) {
            int[] judge = new int[9];
            for (int j = 0; j < 9; j++) {
                int c = board[i][j]-'0';
                if(c<=9&&c>=1) {
                    if(judge[c-1]!=0) return false;
                    judge[c-1] = 1;
                }
            }
        }

        for (int sign = 0; sign < 9; sign++) {
            int[] judge = new int[9];
            int s_i = (sign%3)*3;
            int s_j = (sign/3)*3;
            for (int i = s_i; i < s_i+3; i++) {
                for (int j = s_j; j < s_j+3; j++) {
                    int c = board[i][j]-'0';
                    if(c<=9&&c>=1) {
                        if(judge[c-1]!=0) return false;
                        judge[c-1] = 1;
                    }
                }

            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        No36 no36 = new No36();
        char[][] board = new char[][]{{'.','.','4','.','.','.','6','3','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'5','.','.','.','.','.','.','9','.'},
                {'.','.','.','5','6','.','.','.','.'},
                {'4','.','3','.','.','.','.','.','.'},
                {'.','.','.','7','.','.','.','.','.'},
                {'.','.','.','5','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'}};
        System.out.println(no36.isValidSudoku(board));
    }
}
