package ZJOffer;

/**
 * <h3>leetcode</h3>
 * <p>数组中的逆序对数</p>
 *
 * @author : 张严
 * @date : 2021-04-07 16:44
 **/
public class Offer51 {
    int[] nums,temp;
    public int reversePairs(int[] nums) {
        this.nums = nums;
        temp = new int[nums.length];
        return  mergeSort(0,nums.length-1);
    }
    public  int mergeSort(int left,int right){
        if(left>=right) return 0;
        int mid = (left+right)/2;
        int res = mergeSort(left,mid)+mergeSort(mid+1,right);
        for (int w = left; w <= right; w++) {
            temp[w] = nums[w];
        }
        int i=left, j=mid+1;
        for(int k=left;k<=right;k++){
            if(i==mid+1){
                nums[k] = temp[j++];
            }else if(j==right+1||temp[i]<=temp[j]){
                nums[k] = temp[i++];
            }else {
                nums[k] = temp[j++];
                res = res+mid-i+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Offer51 offer51 = new Offer51();
        System.out.println(offer51.reversePairs(new int[]{1,3,2,3,1}));
    }
}
