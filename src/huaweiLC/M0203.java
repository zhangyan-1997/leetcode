package huaweiLC;

import utils.ListNode;

public class M0203 {

    //此题解法甚为巧妙
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
