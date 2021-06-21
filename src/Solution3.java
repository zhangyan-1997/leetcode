import java.util.PriorityQueue;
import java.util.Queue;

public class Solution3 {
    public static void main(String[] args) {
        int[] nums = {2,5,9,7,6,8,3,8,9};
        System.out.println(findKthLargest(nums,2));

    }


    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> heap = new PriorityQueue<>(k,(x1, x2)->(x1-x2)); //创建小顶堆
        for(int i=0;i<nums.length;i++){
            if(heap.size()<k){
                heap.offer(nums[i]);
            }else if(nums[i]>heap.peek()){
                heap.poll();
                heap.offer(nums[i]);
            }
        }
        return heap.peek();
    }
}

