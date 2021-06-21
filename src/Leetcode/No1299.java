package Leetcode;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>将每个元素替换为右侧最大元素</p>
 *
 * @author : 张严
 * @date : 2021-03-31 10:35
 **/
public class No1299 {
    public static int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int max = -1;
            for(int j=arr.length-1;j>i;j--){
                max = Math.max(max,arr[j]);
            }
            arr[i]=max;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{400})));
    }
}
