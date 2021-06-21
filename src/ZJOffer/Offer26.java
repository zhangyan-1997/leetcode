package ZJOffer;
import utils.TreeNode;

//判断二叉树是否包含某个子树
public class Offer26 {
    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }
    static boolean recur(TreeNode A, TreeNode B) {
        if(B == null) return true;
        if(A == null || A.val != B.val) return false;
        return recur(A.left, B.left) && recur(A.right, B.right);
    }

    public static void main(String[] args) {
        TreeNode A = TreeNode.build("[1,2,3,4,null,null,null,null,null,null]");
        TreeNode B = TreeNode.build("[3,null,null]");
        System.out.println(isSubStructure(A,B));
    }
}
