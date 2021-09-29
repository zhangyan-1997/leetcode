package tencent0905;

import utils.ListNode;

import java.util.LinkedList;
import java.util.Queue;

public class demo01 {
    public ListNode solve (ListNode[] a) {
        // write code here
        Queue<ListNode> queue = new LinkedList<>();
        ListNode res = new ListNode(0);
        ListNode p = res;
        for (ListNode node: a){
            if(node!=null) queue.offer(node);
        }
        while (!queue.isEmpty()){
            p.next = queue.poll();
            p = p.next;
            if(p.next!=null) queue.offer(p.next);
        }
        return res.next;
    }
}
