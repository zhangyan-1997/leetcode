package Leetcode.Part301;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>反转字符串</p>
 *
 * @author : 张严
 * @date : 2021-03-31 13:22
 **/
public class No344 {
    public static void reverseString(char[] s) {
        int i = 0,j=s.length-1;
        char temp ='0';
        while (i<j){
            temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char[] ss = new char[]{'h','e','l','l','o'};
        reverseString(ss);
        System.out.println(Arrays.toString(ss));
    }
}
