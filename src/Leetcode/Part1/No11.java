package Leetcode.Part1;

/**
 * <h3>leetcode</h3>
 * <p>盛最多水的容器</p>
 *
 * @author : 张严
 * @date : 2021-04-08 18:29
 **/
public class No11 {
    public static int maxArea(int[] height) {
        int res =0;
        int i=0;
        int j=height.length-1;
        //双指针法
        while(i<j){
            if(height[i]<height[j]){
                res = Math.max(res,(j-i)*height[i]);
                i++;
            }else {
                res = Math.max(res,(j-i)*height[j]);
                j--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,2,1};
        System.out.println(maxArea(height));
    }
}
