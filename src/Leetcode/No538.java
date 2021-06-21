package Leetcode;
import utils.TreeNode;
/**
 * <h3>leetcode</h3>
 * <p>把二叉搜索树转换为累加树</p>
 *
 * @author : 张严
 * @date : 2021-04-02 15:27
 **/
public class No538 {
    int sum =0;
    public TreeNode convertBST(TreeNode root) {
        convert(root);
       return root;
    }
    public void convert(TreeNode root){
        if(root==null) return;
        convert(root.right);
        root.val = sum+root.val;
        sum = root.val;
        convert(root.left);
    }
}
