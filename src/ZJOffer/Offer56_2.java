package ZJOffer;

/**
 * <h3>leetcode</h3>
 * <p>数组中数字出现的次数2</p>
 *
 * @author : 张严
 * @date : 2021-04-08 16:01
 **/
public class Offer56_2 {
    public static int singleNumber(int[] nums) {
        int ones =0,twos = 0;
        for(int num:nums){
            ones = ones^num&~twos;
            twos = twos^num&~ones;
        }
        return ones;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{3,4,3,3}));
    }
}
