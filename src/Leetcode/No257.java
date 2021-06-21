package Leetcode;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>二叉树的所有路径</p>
 *
 * @author : 张严
 * @date : 2021-06-07 14:02
 **/
public class No257 {
    List<String> res;
    public List<String> binaryTreePaths(TreeNode root) {
        res = new ArrayList<>();
        if(root == null) return res;
        dfs(root,"");
        return res;
    }

    private void dfs(TreeNode root, String s){
        if(root.left == null && root.right == null){
            s += root.val;
            res.add(s);
            return;
        }
        s += root.val + "->";
        if(root.left!=null) dfs(root.left,s);
        if(root.right!=null) dfs(root.right,s);
    }

    public static void main(String[] args) {
        No257 no257 = new No257();
        TreeNode root = TreeNode.build("[1,2,3,null,5,null,null,null,null]");
        System.out.println(no257.binaryTreePaths(root));
    }
}
