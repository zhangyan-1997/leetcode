package Leetcode.Part301;

/**
 * <h3>leetcode</h3>
 * <p>至少有k个重复字符的子串</p>
 *
 * @author : 张严
 * @date : 2021-04-18 17:18
 **/

public class No395 {
    public int longestSubstring(String s, int k) {
        return backtrace(0,s.length()-1,k,s);
    }
    public int backtrace(int start,int end,int k,String s){
        if(end - start +1 <k) return 0;
        int[] alpha = new int[26];
        for(int i=start;i<=end;i++) alpha[s.charAt(i)-'a']++;
        while (start<=end&&alpha[s.charAt(start)-'a']<k) start++;
        while (start<=end&&alpha[s.charAt(end)-'a']<k) end--;
        if(end - start +1 <k) return 0;
        for (int i = start; i <= end; i++) {
            if(alpha[s.charAt(i)-'a']<k){
                return Math.max(backtrace(start,i-1,k,s),backtrace(i+1,end,k,s));
            }
        }
        return end - start+1;
    }

    public static void main(String[] args) {
        No395 no395 = new No395();
        System.out.println(no395.longestSubstring("aaabb", 3));
    }
}


