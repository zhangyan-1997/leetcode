package Leetcode;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>分发糖果</p>
 *
 * @author : 张严
 * @date : 2021-06-11 21:07
 **/
public class No135 {
    public int candy(int[] ratings) {
        int[] left = new int[ratings.length];
        int[] right = new int[ratings.length];
        Arrays.fill(left,1);
        Arrays.fill(right,1);

        for (int i = 1; i < ratings.length; i++) {
            if(ratings[i]>ratings[i-1]) left[i] = left[i-1] + 1;
        }
        for (int i = ratings.length-2; i >= 0; i--) {
            if(ratings[i]>ratings[i+1]) right[i] = right[i+1] + 1;
        }

        int count = left[left.length-1];
        for (int i = left.length-2; i >= 0; i--) {
            count += Math.max(left[i],right[i]);
        }
        return count;
    }
}
