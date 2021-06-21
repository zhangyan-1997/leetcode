package huaweiLC;

/**
 * <h3>leetcode</h3>
 * <p>判断子序列</p>
 *
 * @author : 张严
 * @date : 2021-06-17 17:05
 **/
public class No392 {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length()) return false;

        int index1 = 0;
        int index2 = 0;
        while (index1<s.length()&&index2<t.length()){
            if(t.charAt(index2)==s.charAt(index1)) index1++;
            index2++;
        }
        if(index1==s.length()) return true;
        return false;
    }

    public static void main(String[] args) {
        No392 no392 = new No392();
        System.out.println(no392.isSubsequence("ahc", "ahbgdc"));
    }
}
