public class Solution9 {
    public static void nextPermutation(int[] nums) {
        if(nums.length==1) return;

        int i=nums.length-1;
        int temp =0;
        while(i>0){
            if(nums[i]>nums[i-1]){
                temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
                sort(nums,i+1,nums.length-1);
                break;
            }
            i--;
        }
        if(i==0){
            sort(nums,0,nums.length-1);
        }

    }
    public static void sort(int[] nums,int left,int right){
        if(left<right){
            int pivot = nums[left];
            int i=left,j=right;
            while(i<j){
                while(i<j&&nums[j]>pivot) j--;
                if(i<j){
                    nums[i] = nums[j];
                    i++;
                }
                while (i<j&&nums[i]<pivot) i++;
                if(i<j){
                    nums[j] =nums[i];
                    j--;
                }
            }
            nums[i] = pivot;
            sort(nums,left,i-1);
            sort(nums,i+1,right);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2};
        nextPermutation(nums);
        for(int x:nums){
            System.out.println(x);
        }
    }
}
