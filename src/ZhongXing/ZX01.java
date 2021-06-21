package ZhongXing;

import java.util.Scanner;

/**
 * <h3>leetcode</h3>
 * <p>中兴第一题</p>
 *
 * @author : 张严
 * @date : 2021-05-08 13:45
 **/
public class ZX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(day(k,a,b));



    }
    public static long day(long k, long a, long b){
        long strip = a-b;
        long curr = 0;
        long days = 1;

        if(k==0) return 0;
        else if(k<0) {
            if(strip>=0) return -1;
            while (curr + strip > k){
                days++;
                curr = curr + strip;
            }
        }
        else {
            if(a<k&&strip<=0) return -1;
            while (curr + a <k){
                days ++;
                curr = curr + strip;
            }
        }
        return days;
    }
}
