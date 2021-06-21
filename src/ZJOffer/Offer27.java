package ZJOffer;
import utils.TreeNode;

//返回一个镜像二叉树
public class Offer27 {
    public static TreeNode mirrorTree(TreeNode root) {
        if(root==null) return root;
        TreeNode node = root.right;
        root.right = mirrorTree(root.left);
        root.left = mirrorTree(node);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.build("[4,2,7,1,3,6,9,null,null,null,null,null,null,null,null]");
        root = mirrorTree(root);
        System.out.println(TreeNode.serialize(root));
    }
}
