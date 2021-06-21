import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>链表的定义</p>
 *
 * @author : 张严
 * @date : 2021-04-01 12:05
 **/
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
    public static ListNode built(int[] nums){
        if(nums.length==0) return null;
        ListNode root = new ListNode(nums[0]);
        ListNode p=root;
        int i=1;
        while(i<nums.length){
            p.next=new ListNode(nums[i]);
            p = p.next;
            i++;
        }
        return root;
    }
    public static void printListNode(ListNode root){
        List<Integer> res = new ArrayList<>();
        while(root!=null){
            res.add(root.val);
            root = root.next;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        printListNode(ListNode.built(new int[]{3,2,0,-4,1,2}));
    }
}

