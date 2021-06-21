package ZJOffer;

import java.util.Arrays;
import utils.TreeNode;
/**
 * <h3>leetcode</h3>
 * <p>重建二叉树</p>
 *
 * @author : 张严
 * @date : 2021-04-14 11:11
 **/
public class Offer07 {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0||inorder.length==0) return null;

        TreeNode root = new TreeNode(preorder[0]);
        int mid = 0;
        while (inorder[mid]!=preorder[0]) mid++;
        root.left = buildTree(Arrays.copyOfRange(preorder,1,mid+1),Arrays.copyOfRange(inorder,0,mid));
        root.right = buildTree(Arrays.copyOfRange(preorder,mid+1,preorder.length),Arrays.copyOfRange(inorder,mid+1,inorder.length));
        return root;
    }

    public static void main(String[] args) {
        System.out.println(TreeNode.serialize(buildTree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7})));
    }
}
