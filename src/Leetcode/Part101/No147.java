package Leetcode.Part101;

import utils.ListNode;

/**
 * <h3>leetcode</h3>
 * <p>对链表进行插入排序</p>
 *
 * @author : 张严
 * @date : 2021-05-13 15:30
 **/
public class No147 {
    public ListNode insertionSortList(ListNode head) {
        if(head == null) return null;
        head.next = insertionSortList(head.next);
        if(head.next==null||(head.next!=null&&head.val<=head.next.val)) return head;

        ListNode s = head;
        head = head.next;
        ListNode p = head;
        ListNode ptr = head;
        while (p!=null&&p.val<s.val) {
            ptr = p;
            p = p.next;
        }
        ptr.next = s;
        s.next = p;
        return head;
    }

    public static void main(String[] args) {
        ListNode root = ListNode.built(new int[]{-1,2});
        No147 no147 = new No147();
        ListNode listNode = no147.insertionSortList(root);
        ListNode.printListNode(listNode);

    }
}
