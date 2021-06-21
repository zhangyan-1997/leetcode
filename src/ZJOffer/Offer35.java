package ZJOffer;

import java.util.HashMap;

/**
 * <h3>leetcode</h3>
 * <p>复杂链表的复制</p>
 *
 * @author : 张严
 * @date : 2021-05-26 11:12
 **/
public class Offer35 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Node cur = head;
        HashMap<Node, Node> map = new HashMap<>();
        while (cur!=null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }

        cur = head;
        while (cur!=null){
           map.get(cur).next = map.get(cur.next);
           map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(head);

    }
}
