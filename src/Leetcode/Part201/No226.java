package Leetcode.Part201;
import utils.TreeNode;

/**
 * <h3>leetcode</h3>
 * <p>翻转二叉树</p>
 *
 * @author : 张严
 * @date : 2021-03-30 21:11
 **/
public class No226 {
    public static TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        TreeNode node = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(node);
        return root;
    }

    public static void main(String[] args) {
        System.out.println(TreeNode.serialize(invertTree(TreeNode.build("[4,2,7,1,3,6,9,null,null,null,null,null,null,null,null]"))));
    }
}
