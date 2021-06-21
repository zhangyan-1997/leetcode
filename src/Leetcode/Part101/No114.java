package Leetcode.Part101;

import utils.TreeNode;

/**
 * <h3>leetcode</h3>
 * <p>二叉树展开为链表</p>
 *
 * @author : 张严
 * @date : 2021-04-19 10:08
 **/
public class No114 {
    public void flatten(TreeNode root) {
        if(root==null) return;
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right!=null) root = root.right;
        root.right = temp;
    }

    public static void main(String[] args) {
        No114 no114 = new No114();
        TreeNode root = TreeNode.build("[1,2,5,3,4,null,6,null,null,null,null]");
        no114.flatten(root);
        System.out.println(TreeNode.serialize(root));
    }
}
