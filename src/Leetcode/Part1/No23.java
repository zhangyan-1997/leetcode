package Leetcode.Part1;

import utils.ListNode;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * <h3>leetcode</h3>
 * <p>合并k个升序链表</p>
 *
 * @author : 张严
 * @date : 2021-05-12 20:51
 **/
public class No23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null||lists.length == 0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length,(o1,o2)->( o1.val-(o2.val)));

        ListNode res = new ListNode(0);
        ListNode p = res;

        for(ListNode node:lists){
            if(node!=null) queue.offer(node);
        }

        while (!queue.isEmpty()){
            p.next = queue.poll();
            p = p.next;
            if(p.next!=null) queue.offer(p.next);
        }
        return res;
    }
}
