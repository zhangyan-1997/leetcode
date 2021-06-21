package byteDance;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <h3>leetcode</h3>
 * <p>二叉树最大宽度</p>
 *
 * @author : 张严
 * @date : 2021-05-14 19:23
 **/
public class No662 {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int max = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            max = Math.max(max,queue.getLast().val-queue.getFirst().val+1);
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left!=null) {
                    node.left.val = node.val*2+1;
                    queue.offer(node.left);
                }
                if(node.right!=null) {
                    node.right.val = node.val*2+2;
                    queue.offer(node.right);
                }
            }
        }
        return max;

    }
}
