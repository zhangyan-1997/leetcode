package byteDance;

import utils.ListNode;

/**
 * <h3>leetcode</h3>
 * <p>链表的中间结点</p>
 *
 * @author : 张严
 * @date : 2021-05-13 11:24
 **/
public class No876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode root = ListNode.built(new int[]{1});
        No876 no876 = new No876();
        ListNode listNode = no876.middleNode(root);
        ListNode.printListNode(listNode);
    }
}
