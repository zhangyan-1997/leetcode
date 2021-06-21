package Leetcode.Part51;

import utils.ListNode;

/**
 * <h3>leetcode</h3>
 * <p>分割链表</p>
 *
 * @author : 张严
 * @date : 2021-05-31 16:00
 **/
public class No86 {
    public ListNode partition(ListNode head, int x) {
        if(head == null) return head;
        ListNode front = new ListNode(-1);
        ListNode front_p = front;
        ListNode last = new ListNode(-1);
        ListNode last_p = last;

        ListNode p = head;
        ListNode q = null;
        while (p!=null){
            q = p;
            p = p.next;
            if(q.val < x) {
                front_p.next = q;
                front_p = front_p.next;
                front_p.next = null;
            }
            else {
                last_p.next = q;
                last_p = last_p.next;
                last_p.next = null;
            }
        }
        front_p.next = last.next;
        ListNode.printListNode(front.next);
        return front.next;
    }

    public static void main(String[] args) {
        No86 no86 = new No86();
        ListNode head = ListNode.built(new int[]{});
        no86.partition(head,2);
    }
}
