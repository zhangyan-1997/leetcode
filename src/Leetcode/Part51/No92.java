package Leetcode.Part51;

import utils.ListNode;

/**
 * <h3>leetcode</h3>
 * <p>反转链表2</p>
 *
 * @author : 张严
 * @date : 2021-05-14 13:38
 **/
public class No92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right||head == null) return head;
        ListNode p = head;
        ListNode front = null;
        int i = 1;
        while (p!=null&&i<left){
            front = p;
            p = p.next;
            i++;
        }

        ListNode ptr = p;
        ListNode s = null;
        ListNode h = ptr;
        ListNode now = p.next;
        i++;
        while (i<=right){
            s = now;
            now = now.next;
            s.next = h;
            h = s;
            i++;
        }
        ptr.next = now;
        if(left == 1) return h;
        front.next = h;
        return head;
    }

    public static void main(String[] args) {
        ListNode root = ListNode.built(new int[]{5,2,3});
        No92 no92 = new No92();
        root = no92.reverseBetween(root,1,3);
        ListNode.printListNode(root);
    }
}
