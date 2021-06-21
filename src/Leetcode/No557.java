package Leetcode;

/**
 * <h3>leetcode</h3>
 * <p>反转字符串中的单词3</p>
 *
 * @author : 张严
 * @date : 2021-06-01 09:54
 **/
public class No557 {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            split[i] = reverse(split[i]);
            sb.append(split[i]+" ");
        }
        return sb.toString().trim();
    }

    private String reverse(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        No557 no557 = new No557();
        System.out.println(no557.reverseWords("Let's take LeetCode contest"));
    }
}
