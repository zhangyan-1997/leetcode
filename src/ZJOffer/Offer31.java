package ZJOffer;

import java.util.Stack;

public class Offer31 {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i=0;
        for(int x:pushed){
            stack.push(x);
            while (!stack.isEmpty()&&stack.peek()==popped[i]){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,4,5};
        int[] nums2 = new int[]{4,3,5,1,2};
        System.out.println(validateStackSequences(nums1,nums2));
    }
}
