package Leetcode.Part101;

import utils.ListNode;

/**
 * <h3>leetcode</h3>
 * <p>重排链表</p>
 *
 * @author : 张严
 * @date : 2021-05-13 16:19
 **/
public class No143 {
    public ListNode reverse(ListNode root){
        if(root == null) return null;
        ListNode s = null;
        ListNode p = root;
        ListNode q = null;
        while (p!=null){
            q = p;
            p = p.next;
            q.next = s;
            s = q;
        }
        return s;
    }
    public void reorderList(ListNode head) {
        //快慢指针分成两段

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        //后半段反转
        ListNode right = reverse(slow.next);
        slow.next = null;

        //重新插入
        ListNode p = head;
        ListNode s =null;

        while (p!=null&&right!=null){
            s = right;
            right = right.next;
            s.next = p.next;
            p.next = s;
            p = s.next;
        }
    }

    public static void main(String[] args) {
        ListNode root = ListNode.built(new int[]{1, 2, 3, 4});
        No143 no143 = new No143();
        no143.reorderList(root);
        ListNode.printListNode(root);
    }
}
