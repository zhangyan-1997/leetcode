package utils;

/**
 * <h3>leetcode</h3>
 * <p>带随机指针的链表</p>
 *
 * @author : 张严
 * @date : 2021-05-14 22:08
 **/
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
