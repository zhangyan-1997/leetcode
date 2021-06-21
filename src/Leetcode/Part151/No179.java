package Leetcode.Part151;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>最大数</p>
 *
 * @author : 张严
 * @date : 2021-04-11 21:37
 **/
public class No179 {
    public static String largestNumber(int[] nums) {
        String[] ss = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            ss[i] = String.valueOf(nums[i]);
        }
        //Arrays.sort(ss,(x1,x2)->((x2+x1).compareTo(x1+x2)));
        quickSort(ss,0,ss.length-1);
        StringBuilder sb = new StringBuilder();
        for(String s:ss){
            if(sb.toString().equals("0")) sb.delete(0,1);
            sb.append(s);
        }
        return sb.toString();
    }
    public static void quickSort(String[] ss,int left,int right){
        if(left>=right) return;
        int i=left,j=right;
        String pivot = ss[left];
        while (i<j){
            while (i<j&&(ss[j]+pivot).compareTo(pivot+ss[j])<0) j--;
            while (i<j&&(pivot+ss[i]).compareTo(ss[i]+pivot)<=0) i++;
            if(i<j){
                String temp = ss[j];
                ss[j] = ss[i];
                ss[i] = temp;
            }
        }
        ss[left] = ss[i];
        ss[i] = pivot;
        quickSort(ss,left,i-1);
        quickSort(ss,i+1,right);
    }

    public static void main(String[] args) {
        System.out.println(largestNumber(new int[]{3,30,34,5,9}));
    }
}
