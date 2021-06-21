package Leetcode;

/**
 * <h3>leetcode</h3>
 * <p>目标和</p>
 *
 * @author : 张严
 * @date : 2021-03-30 18:54
 **/
public class No494 {
    public static int findTargetSumWays(int[] nums, int S) {
        return backstrack(nums,S,0,0);

    }
    public static int backstrack(int[] num,int S,int sum,int index){
        if(index==num.length){
            if(sum==S) return 1;
            return 0;
        }
        int x1=0,x2=0;
        x1=backstrack(num,S,sum+num[index],index+1);
        x2=backstrack(num,S,sum-num[index],index+1);
        return x1+x2;
    }

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1,1,1,1,1},3));
    }
}
