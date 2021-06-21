package Leetcode;

import utils.TreeNode;

/**
 * <h3>leetcode</h3>
 * <p>二叉树剪枝</p>
 *
 * @author : 张严
 * @date : 2021-05-19 17:16
 **/
public class No814 {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return root;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.left==null&&root.right==null&&root.val==0) return null;
        return root;
    }
}
