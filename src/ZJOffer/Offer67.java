package ZJOffer;

/**
 * <h3>leetcode</h3>
 * <p>把字符串转换成整数</p>
 *
 * @author : 张严
 * @date : 2021-04-08 17:00
 **/
public class Offer67 {
    public static int strToInt(String str){
        if (str.length()==0) return 0;
        int res =0,sign=1,boundry=Integer.MAX_VALUE/10;
        int i=0;
        //判断空格
        while (str.charAt(i)==' '){
            i++;
            if(i==str.length()) return 0;
        }
        //判断正负号
        if(str.charAt(i)=='-') sign = -1;
        if(str.charAt(i)=='+'||str.charAt(i)=='-') i++;
        for(int j=i;j<str.length();j++){
            if(str.charAt(j)<'0'||str.charAt(j)>'9') break;
            if(res>boundry||res==boundry&&str.charAt(j)>'7'){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res = res*10+(str.charAt(j)-'0');
        }
        return res*sign;
    }

    public static void main(String[] args) {
        System.out.println(strToInt("-91283472332"));
    }
}
