package ThreeSixZero;

import java.util.Arrays;
import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(help(nums));
    }
    public static int help(int[] nums){
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            while (nums[i] >= nums[i-1]) {
                count++;
                nums[i]--;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}
