package Leetcode.Part101;

import utils.Node;

import java.util.HashMap;

/**
 * <h3>leetcode</h3>
 * <p>复制带随机指针的链表</p>
 *
 * @author : 张严
 * @date : 2021-05-14 22:09
 **/
public class No138 {
    HashMap<Node,Node> map = new HashMap<>();
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        if(map.containsKey(head)) return map.get(head);
        Node root = new Node(head.val);
        map.put(head,root);
        root.next = copyRandomList(head.next);
        root.random = copyRandomList(head.random);
        return root;

    }
}
