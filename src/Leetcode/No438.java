package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>找到字符串中所有字母异位词</p>
 *
 * @author : 张严
 * @date : 2021-04-01 19:40
 **/
public class No438 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length()<p.length()) return res;

        int[] pCnt = new int[26];
        int[] sCnt = new int[26];

        for(int i=0;i<p.length();i++) pCnt[p.charAt(i)-'a']++;

        int left = 0;
        for(int right = 0;right<s.length();right++){
            sCnt[s.charAt(right)-'a']++;
            while (sCnt[s.charAt(right)-'a']>pCnt[s.charAt(right)-'a']){
                sCnt[s.charAt(left)-'a']--;
                left++;
            }
            if(right-left+1==p.length()) res.add(left);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("abab","ab"));
    }
}
