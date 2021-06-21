public class Solution18 {
    public static int[] searchRange(int[] nums, int target) {
        int[] soultion = new int[]{-1,-1};
        if(nums.length == 0){
            return soultion;
        }
        int left = 0;
        int right = nums.length-1;
        int mid=0;
        while(left<right){
            mid=(left+right)/2;
            if(nums[mid]==target){
                break;
            }
            if(nums[mid]>target){
                right=mid-1;
            }
            if(nums[mid]<target){
                left=mid+1;
            }
        }
        if(left==right&&nums[left]!=target){
            return soultion;
        }
        int i=mid-1,j=mid+1;
        while(i>=0&&nums[i]==target){
            i--;
        }
        while (j<nums.length&&nums[j]==target) {
            j++;
        }
        soultion[0] = i+1;
        soultion[1] = j-1;
        return soultion;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{2,2};
        int[] res = searchRange(ints,1);
        System.out.println(res[0]+" "+res[1]);
    }
}
