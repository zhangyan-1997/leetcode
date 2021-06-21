package Leetcode.Part301;

/**
 * <h3>leetcode</h3>
 * <p>字符串中的第一个唯一字符</p>
 *
 * @author : 张严
 * @date : 2021-04-12 14:28
 **/
public class No387 {
    public int firstUniqChar(String s) {
        int[] alpha = new int[26];
        for(char c:s.toCharArray()){
            alpha[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(alpha[ s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new No387().firstUniqChar("loveleetcode"));
    }
}
