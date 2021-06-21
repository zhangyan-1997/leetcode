package ZJOffer;

import java.util.HashSet;
import java.util.Set;

public class Offer48 {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            set.add(chars[i]);
            int j=i+1;
            while (j<chars.length&&!set.contains(chars[j])){
                set.add(chars[j]);
                j++;
            }
            max = Math.max(max,(j-i));
            set.clear();
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
}
