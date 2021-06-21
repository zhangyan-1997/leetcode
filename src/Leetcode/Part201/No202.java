package Leetcode.Part201;

import java.util.HashSet;

/**
 * <h3>leetcode</h3>
 * <p>快乐数</p>
 * @author : 张严
 * @date : 2021-03-30 11:05
 **/
public class No202 {
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (true){
            System.out.println(n);
            if(n==1||set.contains(n)) break;
            set.add(n);
            n = getNext(n);
        }
        if(n==1) return true;
        return false;
    }
    public static int getNext(int n){
        int res =0;
        while (n>0){
            res = res + (n%10)*(n%10);
            n = n/10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
