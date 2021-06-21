package Leetcode.Part1;

import utils.ListNode;

/**
 * <h3>leetcode</h3>
 * <p>两两交换链表中的节点</p>
 *
 * @author : 张严
 * @date : 2021-05-14 20:28
 **/
public class No24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode s = swapPairs(head.next.next);
        ListNode p = head.next;
        p.next = head;
        head.next = s;
        return p;
    }

    public static void main(String[] args) {
        ListNode root = ListNode.built(new int[]{1,2,3,4,5,6});
        ListNode.printListNode(root);
        No24 no24 = new No24();
        root = no24.swapPairs(root);
        ListNode.printListNode(root);
    }
}
