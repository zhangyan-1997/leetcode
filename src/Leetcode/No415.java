package Leetcode;

/**
 * <h3>leetcode</h3>
 * <p>字符串相加</p>
 *
 * @author : 张严
 * @date : 2021-06-01 10:25
 **/
public class No415 {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;

        int ca = 0;
        int x1,x2;
        int sum = 0;

        while (i>=0&&j>=0){
            x1 = num1.charAt(i) - '0';
            x2 = num2.charAt(j) - '0';

            sum = (ca + x1 + x2)%10;
            ca = (ca + x1 + x2)/10;
            res.append(sum);
            i--;
            j--;
        }
        while (i>=0){
            sum = (ca +num1.charAt(i) - '0')%10;
            ca = (ca +num1.charAt(i) - '0')/10;
            res.append(sum);
            i--;
        }

        while (j>=0){
            sum = (ca +num2.charAt(j) - '0')%10;
            ca = (ca +num2.charAt(j) - '0')/10;
            res.append(sum);
            j--;
        }
        if(ca>0) res.append(ca);
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        No415 no415 = new No415();
        System.out.println(no415.addStrings("123456", "99999"));
    }
}
