package Leetcode.Part51;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>leetcode</h3>
 * <p>最小覆盖子串</p>
 *
 * @author : 张严
 * @date : 2021-05-18 18:49
 **/
public class No76 {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map_t = new HashMap<>();
        Map<Character,Integer> map_s = new HashMap<>();
        for(char c:t.toCharArray()){
            map_t.put(c,map_t.getOrDefault(c,0)+1);
        }

        int res = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int valid = 0;
        int start = 0;
        while (right < s.length()){
            char c = s.charAt(right);
            right++;
            if(map_t.containsKey(c)){
                map_s.put(c,map_s.getOrDefault(c,0)+1);
                if(map_s.get(c).equals(map_t.get(c))) valid++;
            }
            while (valid == map_t.size()){

                if(right-left <res){
                    start = left;
                    res = right - left;
                }
                char d = s.charAt(left);
                left++;
                if (map_t.containsKey(d)){
                    if(map_s.get(d).equals(map_t.get(d))) valid--;
                    map_s.put(d,map_s.getOrDefault(d,0)-1);
                }
            }
        }
        return res == Integer.MAX_VALUE? "":s.substring(start,start+res);
    }

    public static void main(String[] args) {
        No76 no76 = new No76();
        System.out.println(no76.minWindow("ADOBECODEBANC", "ABC"));
    }
}
