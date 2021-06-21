package Leetcode.Part201;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>计数质数</p>
 *
 * @author : 张严
 * @date : 2021-04-09 16:28
 **/
public class No204 {
    public int countPrimes(int n) {
        if(n<2) return 0;
        boolean[] isPrimes = new boolean[n];
        Arrays.fill(isPrimes,true);
        for(int i=2;i<=Math.sqrt(n);i++){
            if(isPrimes[i]==true){
                int k =2;
                while (i*k<n){
                    isPrimes[i*k] = false;
                    k++;
                }
            }
        }
        int count =0;
        for(int j=2;j<n;j++){
            if(isPrimes[j]==true) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new No204().countPrimes(10));
    }
}
