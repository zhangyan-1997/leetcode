package Leetcode.Part201;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>有效的字母异位词</p>
 *
 * @author : 张严
 * @date : 2021-04-11 22:29
 **/
public class No242 {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] alpha = new int[26];
        for(int i=0;i<s.length();i++){
            alpha[s.charAt(i)-'a']++;
            alpha[t.charAt(i)-'a']--;
        }
        for(int j=0;j<26;j++){
            if(alpha[j]!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
