package ThreeSixZero;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dfs(nums, i));
        }
        System.out.println(max);
    }

    public static int dfs(int[] nums, int index){
        int i = index;
        int j = index;
        while (i>=1 && nums[i-1] < nums[i]) i--;
        while (j<nums.length-1 && nums[j+1] < nums[j]) j++;
        return j - i + 1;
    }
}
