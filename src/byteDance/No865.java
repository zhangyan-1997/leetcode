package byteDance;

import utils.TreeNode;

/**
 * <h3>leetcode</h3>
 * <p>具有所有最深节点的最小子树</p>
 *
 * @author : 张严
 * @date : 2021-05-25 10:49
 **/
public class No865 {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root == null) return null;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        if(leftDepth == rightDepth) return root;
        if(leftDepth >rightDepth) return subtreeWithAllDeepest(root.left);
        return subtreeWithAllDeepest(root.right);
    }
    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
