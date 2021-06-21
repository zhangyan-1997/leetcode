package Leetcode;

import utils.ListNode;

/**
 * <h3>leetcode</h3>
 * <p>删除排序链表中的重复元素</p>
 *
 * @author : 张严
 * @date : 2021-06-05 20:59
 **/
public class No83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = new ListNode(-101);
        ListNode q = res;
        ListNode p = head;
        ListNode s = null;
        while (p!=null){
            s = p;
            p = p.next;
            if(s.val != q.val){
                q.next = s;
                q = q.next;
                q.next = null;
            }
        }
        return res.next;
    }

    public static void main(String[] args) {
        No83 no83 = new No83();
        ListNode root = ListNode.built(new int[]{1, 1, 2, 3, 3});
        no83.deleteDuplicates(root);
    }
}
