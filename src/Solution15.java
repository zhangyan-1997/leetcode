public class Solution15 {
    public static void nextPermutation(int[] nums) {
        if(nums.length==1) return;

        int i=nums.length-1;
        int temp =0;
        while(i>0){
            if(nums[i]>nums[i-1]){
                break;
            }
            i--;
        }
        if(i==0) {
            reverse(nums,0,nums.length-1);
            return;
        }

        for(int j=nums.length-1;j>=i;j--){
            if(nums[j]>nums[i-1]){
                temp = nums[j];
                nums[j] = nums[i-1];
                nums[i-1] = temp;
                break;
            }
        }
        reverse(nums,i,nums.length-1);
    }
    public static void reverse(int[] nums,int left,int right){
        int temp =0;
        while(left<right){
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

    }

    public static void main(String[] args) {
        int[] ints = new int[]{1,5,1};
        nextPermutation(ints);
        for(int x:ints){
            System.out.println(x);
        }
    }
}
