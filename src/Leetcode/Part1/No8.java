package Leetcode.Part1;

/**
 * <h3>leetcode</h3>
 * <p>字符串转整数</p>
 *
 * @author : 张严
 * @date : 2021-05-12 16:30
 **/
public class No8 {
    public int myAtoi(String s) {
        if (s.length()==0) return 0;
        int res =0,sign=1,boundry=Integer.MAX_VALUE/10;
        int i=0;
        //判断空格
        while (s.charAt(i)==' '){
            i++;
            if(i==s.length()) return 0;
        }
        //判断正负号
        if(s.charAt(i)=='-') sign = -1;
        if(s.charAt(i)=='+'||s.charAt(i)=='-') i++;

        for(int j=i;j<s.length();j++){
            if(s.charAt(j)<'0'||s.charAt(j)>'9') break;
            if(res>boundry||res==boundry&&s.charAt(j)>'7'){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res = res*10+(s.charAt(j)-'0');
        }
        return res*sign;

    }
}
