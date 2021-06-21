package Leetcode.Part51;

/**
 * <h3>leetcode</h3>
 * <p>二进制求和</p>
 *
 * @author : 张严
 * @date : 2021-05-30 19:15
 **/
public class No67 {
    public String addBinary(String a, String b) {
       StringBuilder sb = new StringBuilder();
        int ca = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while (i>=0||j>=0){
            int sum = ca;
            if(i>=0) sum = sum + a.charAt(i) - '0';
            if(j>=0) sum = sum + b.charAt(j) - '0';
            sb.append(sum%2);
            ca = sum/2;
            i--;
            j--;
        }
        if(ca == 1) sb.append(ca);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        No67 no67 = new No67();
        System.out.println(no67.addBinary("11", "1"));
    }
}
