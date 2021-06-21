package Leetcode.Part51;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>加一</p>
 *
 * @author : 张严
 * @date : 2021-04-12 16:02
 **/
public class No66 {
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9) {
            digits[digits.length-1]++;
            return digits;
        }
        int i=digits.length-1;
        while (i>=0&&(digits[i]+1==10)){
            digits[i]=0;
            i--;
        }
        if(i<0){
            int[] res = new int[digits.length+1];
            res[0]=1;
            for(int j=0;j<digits.length;j++){
                res[j+1] = digits[j];
            }
            return res;
        }
        digits[i]++;
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{4,3,2,1})));
    }
}
