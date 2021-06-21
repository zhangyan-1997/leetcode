package Leetcode.Part101;

import utils.TreeNode;

/**
 * <h3>leetcode</h3>
 * <p>平衡二叉树</p>
 *
 * @author : 张严
 * @date : 2021-06-01 10:12
 **/
public class No110 {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(isBalanced(root.left) && isBalanced(root.right) && Math.abs(depth(root.left)-depth(root.right)) <=1 ) return true;
        return false;
    }

    public int depth(TreeNode root){
        if(root == null) return 0;
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}
