package Leetcode;

import utils.TreeNode;

/**
 * <h3>leetcode</h3>
 * <p>路径总和</p>
 *
 * @author : 张严
 * @date : 2021-06-05 21:11
 **/
public class No112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return dfs(root,root.val,targetSum);
    }

    private boolean dfs(TreeNode root,int sum, int target){
        if(sum == target && root.left == null && root.right == null) return true;
        if(root.left!=null && dfs(root.left,sum+root.left.val,target)) return true;
        if(root.right!=null) return dfs(root.right,sum+root.right.val,target);
        return false;
    }

    public static void main(String[] args) {
        No112 no112 = new No112();
        TreeNode root = TreeNode.build("[]");
        System.out.println(no112.hasPathSum(root, 0));
    }
}
