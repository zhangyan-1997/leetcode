package Leetcode.Part101;
import utils.ListNode;
import java.util.HashSet;
import java.util.Set;

/**
 * <h3>leetcode</h3>
 * <p>环形链表_2</p>
 *
 * @author : 张严
 * @date : 2021-04-01 12:15
 **/
public class No142 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head!=null){
            if(set.contains(head)){
                return head;
            }else {
                set.add(head);
            }
            head = head.next;
        }
        return null;
    }
}
