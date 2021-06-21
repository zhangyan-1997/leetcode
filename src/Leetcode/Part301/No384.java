package Leetcode.Part301;

import java.util.Arrays;
import java.util.Random;

/**
 * <h3>leetcode</h3>
 * <p>打乱数组</p>
 *
 * @author : 张严
 * @date : 2021-04-12 15:12
 **/
public class No384 {
    static class Shuffle{
        int[] nums;
        public Shuffle(int[] nums) {
            this.nums = nums;
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return nums;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            int[] shuf = Arrays.copyOf(nums,nums.length);
            Random random = new Random();
            for(int i=shuf.length-1;i>0;i--){
                int k = Math.abs(random.nextInt())%(i+1);
                int temp = shuf[k];
                shuf[k] = shuf[i];
                shuf[i] = temp;
            }
            return shuf;
        }
    }

    public static void main(String[] args) {
        Shuffle shuffle = new Shuffle(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(shuffle.shuffle()));
        System.out.println(Arrays.toString(shuffle.reset()));
        System.out.println(Arrays.toString(shuffle.shuffle()));

    }
}
