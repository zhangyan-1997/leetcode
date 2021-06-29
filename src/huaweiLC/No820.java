package huaweiLC;

import java.util.Arrays;
import java.util.Comparator;

public class No820 {
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len1 = o1.length();
                int len2 = o2.length();
                int i = len1 - 1;
                int j = len2 - 1;
                while (i >=0 && j >= 0){
                    char c1 = o1.charAt(i);
                    char c2 = o2.charAt(j);
                    if(c1 != c2) return c1 - c2;
                    i--;
                    j--;
                }
                return len1 - len2;
            }
        });

        int res = 0;
        for (int i = 0; i < words.length; i++) {
            if(i<words.length-1 && words[i+1].endsWith(words[i])) continue;
            res += (words[i].length() + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strings = {"me", "lime", "time", "bell"};
        No820 no820 = new No820();
        System.out.println(no820.minimumLengthEncoding(strings));
    }
}
