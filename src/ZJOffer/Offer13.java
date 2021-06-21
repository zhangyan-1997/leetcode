package ZJOffer;

import java.util.Arrays;

public class Offer13 {
    public static int movingCount(int m, int n, int k) {
        int[][] borad = new int[m][n];
        dfs(borad,0,0,k);
        int res =0;
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
                if(borad[i][j]==1) res++;
            }

        }
        return res;
    }

    public static void dfs(int[][] borad,int r,int c,int k){

        if(getSum(r)+getSum(c)>k||r<0||c<0||r>=borad.length||c>=borad[0].length||borad[r][c]==1) return;
        borad[r][c] = 1;
        dfs(borad,r-1,c,k);
        dfs(borad,r,c-1,k);
        dfs(borad,r+1,c,k);
        dfs(borad,r,c+1,k);
    }
    public static int getSum(int a){
        int sum =0;
        while (a!=0){
            sum = sum +a%10;
            a = a/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(movingCount(3,1,0));
    }
}
