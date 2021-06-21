package huaweiLC;

/**
 * <h3>leetcode</h3>
 * <p>替换后的最长重复字符</p>
 *
 * @author : 张严
 * @date : 2021-06-16 16:30
 **/
public class No424 {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;

        int historyMax = 0;
        int[] alpha = new int[26];
        while (right<s.length()){
            alpha[s.charAt(right)-'A']++;
            historyMax = Math.max(historyMax, alpha[s.charAt(right)-'A']);
            if(right-left+1 < historyMax +k){
                alpha[s.charAt(left)-'A']--;
                left++;
            }
            right++;
        }
        return right - left;
    }
}
