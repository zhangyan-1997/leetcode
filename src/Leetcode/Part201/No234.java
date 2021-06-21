package Leetcode.Part201;
import utils.ListNode;
/**
 * <h3>leetcode</h3>
 * <p>回文链表</p>
 *
 * @author : 张严
 * @date : 2021-04-01 13:28
 **/
public class No234 {
    public static boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        //快慢指针找中点
        ListNode slow = head,fast=head;
        while(fast.next!=null&&fast.next.next!=null&&slow.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode p1=head,s=reverse(slow.next);
        ListNode.printListNode(s);

        while (s!=null&&p1!=null&&s.val==p1.val){
            s = s.next;
            p1 = p1.next;
        }
        if(s==null||p1==null) return true;
        return false;
    }
    public static ListNode reverse(ListNode root){
        if(root==null||root.next==null) return root;
        ListNode p=root;
        ListNode s=null,ptr=null,next=null;
        while (p!=null){
            next = p.next;
            ptr = p;
            ptr.next = s;
            s = ptr;
            p = next;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(ListNode.built(new int[]{1,2,2,1})));
    }
}
