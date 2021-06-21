package Leetcode;

/**
 * <h3>leetcode</h3>
 * <p>递增的三元子序列</p>
 *
 * @author : 张严
 * @date : 2021-06-17 15:51
 **/

public class No334 {
    public boolean increasingTriplet(int[] nums) {
        int one = Integer.MAX_VALUE,two = Integer.MAX_VALUE;

        //注意：此题比较的顺序不能发生变化
        for(int three : nums){
            if(three > two) return true;
            else if(three <= one) one = three;
            else two = three;
            // if(three > one && three < two) two = three;
        }
        return false;
    }

    public static void main(String[] args) {
        No334 no334 = new No334();
        System.out.println(no334.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }
}
