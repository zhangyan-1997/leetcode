public class Solution26 {
    public static int titleToNumber(String columnTitle) {
        int res = 0;
        int[] map = new int[26];
        for (int i = 0; i < 26; i++) {
            map[i] = i+1;
        }

        char[] str = columnTitle.toCharArray();
        for(char c: str){
            res = res*26 +map[c-'A'];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
}
