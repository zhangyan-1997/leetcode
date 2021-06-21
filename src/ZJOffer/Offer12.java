package ZJOffer;

public class Offer12 {
    public static boolean exist(char[][] board, String word) {
        boolean flag = false;
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                flag = dfs(board,word,i,j,0);
                if(flag==true){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board,String word,int r,int c,int index){
        if(r<0||c<0||r>=board.length||c>=board[0].length||board[r][c]!=word.charAt(index)) return false;
        if(index==word.length()-1) return true;

        board[r][c]='\0';
        boolean flag = dfs(board,word,r-1,c,index+1)||dfs(board,word,r,c-1,index+1)||dfs(board,word,r+1,c,index+1)||dfs(board,word,r,c+1,index+1);
        board[r][c]=word.charAt(index);
        return flag;

    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'a'}};
        System.out.println(exist(board,"a"));
    }
}
