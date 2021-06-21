package Leetcode;

import utils.ListNode;

/**
 * <h3>leetcode</h3>
 * <p>删除排序链表中的重复元素2</p>
 *
 * @author : 张严
 * @date : 2021-05-31 10:28
 **/
public class No82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next==null) return head;

        ListNode res = new ListNode(-101);
        res.next = head;
       ListNode ptr = res;
       ListNode cur = head;
       ListNode p = head;

       int count = 0;
       while (p!=null) {
          while (p!=null&&p.val==cur.val){
              p = p.next;
              count++;
          }
          if(count == 1){
              cur = cur.next;
              ptr = ptr.next;
          }else {
              ptr.next = p;
              cur = p;
          }
          count = 0;
       }
       ListNode.printListNode(res.next);
       return res.next;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.built(new int[]{1,2,3,3,4,4,5});
        No82 no82 = new No82();
        no82.deleteDuplicates(head);
    }
}
