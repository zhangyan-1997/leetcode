package Leetcode.Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>Z字形变换</p>
 *
 * @author : 张严
 * @date : 2021-04-08 19:44
 **/
public class No6 {
    public static String convert(String s, int numRows) {
        System.out.println(s);
        StringBuilder[] sb_list = new StringBuilder[numRows];
        for(int j=0;j<numRows;j++){
            sb_list[j] = new StringBuilder();
        }

        int flag = -1,i=0,k=0;
        while (i<s.length()){
            sb_list[k].append(s.charAt(i));
            if(k==numRows-1||k==0) flag = -flag;
            k = k+flag;
            i++;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb:sb_list) {
            res.append(sb);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",4));
    }
}
