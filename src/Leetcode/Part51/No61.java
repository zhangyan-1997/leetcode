package Leetcode.Part51;
import utils.ListNode;
/**
 * <h3>leetcode</h3>
 * <p>旋转链表</p>
 *
 * @author : 张严
 * @date : 2021-04-01 19:04
 **/
public class No61 {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        if(head.next==null||k==0) return head;
        ListNode slow = head,fast=head;
        int i=0;
        while(i<k){
            if(fast==null){
                fast =head;
            }else{
                fast = fast.next;
                i++;
            }
        }
        if(fast==null) return head;
        while (fast.next!=null){
            fast= fast.next;
            slow=slow.next;
        }
        fast.next = head;
        ListNode res = slow.next;
        slow.next =null;

        return res;
    }

    public static void main(String[] args) {
        ListNode.printListNode(rotateRight(ListNode.built(new int[0]),0));
    }
}
