package huaweiLC;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>二叉树的中序遍历</p>
 *
 * @author : 张严
 * @date : 2021-05-13 10:05
 **/
public class No94 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root){
        inorder(root);
        return res;
    }
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }
}
