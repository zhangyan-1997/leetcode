package Leetcode.Part51;

/**
 * <h3>leetcode</h3>
 * <p>单词搜索</p>
 *
 * @author : 张严
 * @date : 2021-04-01 11:15
 **/
public class No79 {
    public static boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(backstrack(board,word,0,i,j)) return true;
            }
        }
        return false;
    }
    public static boolean backstrack(char[][] borad,String word,int index,int r,int c){
        if(index==word.length()) return true;
        if(r<0||c<0||r>=borad.length||c>=borad[0].length||borad[r][c]!=word.charAt(index)) return false;
        char cc = borad[r][c];
        borad[r][c]='0';
        boolean flag=true;
        System.out.println("row,colum"+r+","+c);
        System.out.println("相等，进入！");
        flag=backstrack(borad,word,index+1,r+1,c)||backstrack(borad,word,index+1,r,c+1)||backstrack(borad,word,index+1,r-1,c)||backstrack(borad,word,index+1,r,c-1);
        borad[r][c]=cc;
        return flag;
    }

    public static void main(String[] args) {
        char[][] grid = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exist(grid,"FCS"));
    }
}
