package Leetcode.Part1;

/**
 * <h3>leetcode</h3>
 * <p>字符串相乘</p>
 *
 * @author : 张严
 * @date : 2021-06-07 10:37
 **/
public class No43 {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")) return "0";
        int[] res = new int[num1.length()+num2.length()];

        for (int i = num1.length()-1; i >= 0; i--) {
            int n1 = num1.charAt(i) - '0';
            for (int j = num2.length()-1; j >= 0; j--) {
                int n2 = num2.charAt(j) - '0';
                res[i+j+1] = res[i+j+1] + n1*n2;
                res[i+j] = res[i+j] + res[i+j+1] /10;
                res[i+j+1] %=10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            if(i==0&&res[i]==0) continue;
            sb.append(res[i]);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        No43 no43 = new No43();
        System.out.println(no43.multiply("123", "456"));
    }
}
