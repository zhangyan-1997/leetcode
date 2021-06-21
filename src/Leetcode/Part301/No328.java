package Leetcode.Part301;

import utils.ListNode;
import utils.TreeNode;


/**
 * <h3>leetcode</h3>
 * <p>奇偶链表</p>
 *
 * @author : 张严
 * @date : 2021-05-12 21:18
 **/
public class No328 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;

        ListNode odd_start = odd;
        ListNode even_start = even;


        ListNode ptr = even.next;
        int i = 3;

        while (ptr!=null){
          if(i%2==1) {
              odd.next = ptr;
              odd = odd.next;
          }
          else {
              even.next = ptr;
              even = even.next;
          }
          ptr = ptr.next;
          i++;
        }
        even.next = null;
        odd.next = even_start;
        return head;
    }

    public static void main(String[] args) {
        No328 no328 = new No328();
        ListNode root = ListNode.built(new int[]{2,1,3,5,6,4,7});
        ListNode.printListNode(root);
        root = no328.oddEvenList(root);
        ListNode.printListNode(root);
    }
}
