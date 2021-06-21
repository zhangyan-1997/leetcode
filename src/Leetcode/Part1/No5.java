package Leetcode.Part1;

/**
 * <h3>leetcode</h3>
 * <p>最长回文子串</p>
 *
 * @author : 张严
 * @date : 2021-04-08 18:21
 **/
public class No5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babadda"));

    }
    public static String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        int maxlength = 0;
        String res = null;
        String now;
        for(int i=0;i<s.length()-1; i++){
            String odd = expand(s,i,i);
            String even = expand(s,i,i+1);
            now = odd.length()>even.length()?odd:even;
            if(now.length()>maxlength){
                maxlength = now.length();
                res = now;
            }
        }
        return res;
    }
    //中心扩展法
    private static String expand(String s, int left, int right){
        int len = s.length();
        int i = left;
        int j = right;
        while(i>=0&&j<len){
            if(s.charAt(i)==s.charAt(j)){
                i--;
                j++;
            }else{
                break;
            }
        }
        return s.substring(i+1,j);
    }
}
