package Leetcode.Part1;

/**
 * <h3>leetcode</h3>
 * <p>最长公共前缀</p>
 *
 * @author : 张严
 * @date : 2021-03-30 16:20
 **/
public class No14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String res = strs[0];
        for(int i=1;i<strs.length;i++){
            int j=0;
            while (j< Math.min(strs[i].length(),res.length())&&strs[i].charAt(j)==res.charAt(j)) j++;
            if(j==0) return "";
            res = res.substring(0,j);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
