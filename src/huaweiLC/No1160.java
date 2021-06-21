package huaweiLC;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>拼写单词</p>
 *
 * @author : 张严
 * @date : 2021-06-15 22:04
 **/
public class No1160 {
    public int countCharacters(String[] words, String chars) {
        int[] alpha = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            alpha[chars.charAt(i)-'a']++;
        }

        int res = 0;
        for (String s: words){
            int[] temp = Arrays.copyOfRange(alpha,0, 26);
            int i = 0;
            while (i<s.length()){
                temp[s.charAt(i)-'a']--;
                if(temp[s.charAt(i)-'a']<0) break;
                i++;
            }
            res += i==s.length()?s.length():0;
        }
        return res;
    }
}
