package Leetcode.Part101;

import utils.TreeNode;

/**
 * <h3>leetcode</h3>
 * <p>二叉树中的最大路径和</p>
 *
 * @author : 张严
 * @date : 2021-05-18 16:46
 **/
public class No124 {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root){
        if(root == null) return 0;

        int left = Math.max(0,dfs(root.left));
        int right = Math.max(0,dfs(root.right));

        // letf->root->right
        int lmr = root.val + left + right;

        //单边最大+root
        int ret = Math.max(left,right) + root.val;
        max = Math.max(max,Math.max(lmr,ret));
        return ret;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.build("[-10,9,20,null,null,15,7,null,null,null,null,null,null]");
        No124 no124 = new No124();
        System.out.println(no124.maxPathSum(root));
    }
}
