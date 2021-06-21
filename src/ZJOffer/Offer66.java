package ZJOffer;

import java.util.Arrays;
/**
 * <h3>leetcode</h3>
 * <p>构建乘积数组</p>
 *
 * @author : 张严
 * @date : 2021-04-08 18:40
 **/
public class Offer66 {
    public static int[] constructArr(int[] a) {
        if(a.length==0) return new int[0];
        int[] b =new int[a.length];

        int left =1;
        for (int i = 0; i < a.length; i++) {
            b[i] = left;
            left = left*a[i];
        }

        int right = 1;
        for (int j = a.length-1; j >=0; j--) {
            b[j] = right*b[j];
            right = right*a[j];
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructArr(new int[]{1,2,3,4,5})));
    }
}
