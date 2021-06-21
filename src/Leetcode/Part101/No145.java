package Leetcode.Part101;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>二叉树后序遍历</p>
 *
 * @author : 张严
 * @date : 2021-05-31 14:12
 **/
public class No145 {
    List<Integer> res;
    public List<Integer> postorderTraversal(TreeNode root) {
        res = new ArrayList<>();
        dfs(root);
        return res;
    }

    public void dfs(TreeNode root){
        if(root ==null) return;
        dfs(root.left);
        dfs(root.right);
        res.add(root.val);
    }
}
