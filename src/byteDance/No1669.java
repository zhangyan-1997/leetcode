package byteDance;

import utils.ListNode;

/**
 * <h3>leetcode</h3>
 * <p>合并两个链表</p>
 *
 * @author : 张严
 * @date : 2021-05-28 13:55
 **/
public class No1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int i = 1;
        ListNode p = list1.next;
        ListNode ptr = list1;
        while(p!=null&&i<a){
            ptr = p;
            p = p.next;
            i++;
        }
        ListNode start = ptr;
        while(p!=null&&i<b){
            p = p.next;
            i++;
        }
        ListNode end = p.next;
        start.next = list2;
        ListNode q = start;
        while (q.next!=null) q = q.next;
        q.next = end;
        return list1;
    }

    public static void main(String[] args) {
        No1669 no1669 = new No1669();
        ListNode list1 = ListNode.built(new int[]{0, 1, 2, 3, 4, 5, 6});
        ListNode list2 = ListNode.built(new int[]{1000000,1000001,1000002,1000003,1000004});
        ListNode res = no1669.mergeInBetween(list1, 2, 2, list2);
        ListNode.printListNode(res);

    }
}
