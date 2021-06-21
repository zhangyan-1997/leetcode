package Leetcode;
import utils.TreeNode;
/**
 * <h3>leetcode</h3>
 * <p>合并二叉树</p>
 *
 * @author : 张严
 * @date : 2021-03-30 18:38
 **/
public class No617 {
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null) return null;
        if(root1==null) return root2;
        if(root2==null) return root1;
        TreeNode root = new TreeNode(root1.val+root2.val);
        root.left=mergeTrees(root1.left,root2.left);
        root.right=mergeTrees(root1.right,root2.right);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root=mergeTrees(TreeNode.build("[1,3,2,5,null,null,null,null,null]"), TreeNode.build("[2,1,3,null,4,null,7,null,null,null,null]"));
        System.out.println(TreeNode.serialize(root));
    }
}
