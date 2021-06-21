package Leetcode.Part1;

/**
 * <h3>leetcode</h3>
 * <p>整数转罗马数字</p>
 *
 * @author : 张严
 * @date : 2021-05-14 16:19
 **/
public class No12 {
    public String intToRoman(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder res = new StringBuilder();

        int index = 0;
        while (index<13){
            while (num>=nums[index]) {
                res.append(romans[index]);
                num = num - nums[index];
            }
            index++;
        }

        return res.toString();
    }

    public static void main(String[] args) {
        No12 no12 = new No12();
        System.out.println(no12.intToRoman(58));
    }
}
