package huaweiLC;

/**
 * *<h>leetcode<h>
 * *@author:张严
 * *<p>KMP算法，字符串匹配<p>
 * *@date 2021-06-23  23:37
 */
public class No28 {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;

        haystack = " " + haystack;
        needle = " " + needle;


        int[] next = new int[needle.length()];

        for (int i = 2, j = 0; i < needle.length(); i++) {
            while (j>0 && needle.charAt(i)!=needle.charAt(j+1)) j = next[j];
            if(needle.charAt(i)==needle.charAt(j+1)) j++;
            next[i] = j;
        }

        for (int i = 1, j = 0; i < haystack.length(); i++) {
            while (j>0 && haystack.charAt(i)!=needle.charAt(j+1)) j = next[j];
            if(haystack.charAt(i)==needle.charAt(j+1)) j++;
            if(j == needle.length()-1) return i - j;
        }
        return -1;
    }

    public static void main(String[] args) {
        No28 no28 = new No28();
        System.out.println(no28.strStr("hello", "ll"));
    }
}
