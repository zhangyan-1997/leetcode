package Leetcode.Part101;

import utils.TreeNode;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>从中序与后序遍历序列构造二叉树</p>
 *
 * @author : 张严
 * @date : 2021-05-31 16:16
 **/
public class No106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0 || postorder.length==0) return null;
        TreeNode root = new TreeNode(postorder[postorder.length-1]);
        int mid = 0;
        while (inorder[mid] != postorder[postorder.length-1]) mid++;
        root.left = buildTree(Arrays.copyOfRange(inorder,0,mid),Arrays.copyOfRange(postorder,0,mid));
        root.right = buildTree(Arrays.copyOfRange(inorder,mid+1,inorder.length),Arrays.copyOfRange(postorder,mid,postorder.length-1));
        return root;
    }

    public static void main(String[] args) {
        No106 no106 = new No106();
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};
        TreeNode treeNode = no106.buildTree(inorder, postorder);
        System.out.println(TreeNode.serialize(treeNode));
    }
}
