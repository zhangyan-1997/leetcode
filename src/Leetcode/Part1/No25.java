package Leetcode.Part1;

import utils.ListNode;

/**
 * <h3>leetcode</h3>
 * <p>K个一组翻转链表</p>
 *
 * @author : 张严
 * @date : 2021-06-07 11:11
 **/
public class No25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode pre = res;
        ListNode end = res;

        ListNode start;
        ListNode next;
        while (end.next!=null){
            for (int i = 0; i < k && end!=null; i++) end = end.next;
            if(end == null) break;

            start = pre.next;
            next = end.next;
            end.next = null;
            pre.next = reverse(start);
            start.next = next;
            pre = start;
            end = pre;
        }
        return res.next;

    }

    private ListNode reverse(ListNode head){
        ListNode now = head;
        ListNode p = head.next;
        ListNode s;
        while (p!=null){
            s = p;
            p = p.next;
            s.next = now;
            now = s;
        }
        return now;
    }
}
