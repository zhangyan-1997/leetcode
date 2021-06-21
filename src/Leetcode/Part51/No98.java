package Leetcode.Part51;
import utils.TreeNode;
/**
 * <h3>leetcode</h3>
 * <p>验证二叉搜索树</p>
 *
 * @author : 张严
 * @date : 2021-03-30 16:42
 **/
public class No98 {
    static long pre = Long.MIN_VALUE;
    public static boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        if(!isValidBST(root.left)){
            return false;
        }
        if(root.val<=pre) return false;
        pre = root.val;
        return isValidBST(root.right);
    }

    public static void main(String[] args) {
        System.out.println(isValidBST(TreeNode.build("[2,1,3,null,null,null,null]")));
    }

}
