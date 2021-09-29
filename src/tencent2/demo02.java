package tencent2;

import java.util.Scanner;

public class demo02 {
    static int max;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int len = sc.nextInt();
            int[] nums = new int[len];
            for (int j = 0; j < len; j++) {
                nums[j] = sc.nextInt();
            }
            getMaxScore(nums);
            System.out.println(max);
        }
    }

    public static int getMaxScore(int[] nums){
        max = 0;
        for (int i = 0; i < nums.length; i++) {
            dfs(nums, i, 0);
        }
        return max;
    }
    public static void dfs(int[] nums, int index, int score){
        if(index>=nums.length || index<0){
            max = Math.max(max, score);
            return;
        }
        score += nums[index];
        int new_index = nums[index]+index;
        dfs(nums, new_index, score);
    }
}
