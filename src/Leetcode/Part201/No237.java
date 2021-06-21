package Leetcode.Part201;
import utils.ListNode;
/**
 * <h3>leetcode</h3>
 * <p>删除链表中的节点</p>
 *
 * @author : 张严
 * @date : 2021-04-12 11:42
 **/
public class No237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }
}
