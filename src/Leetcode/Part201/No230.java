package Leetcode.Part201;

import java.util.ArrayList;
import java.util.List;
import utils.TreeNode;
/**
 * <h3>leetcode</h3>
 * <p>二叉搜索树中第K小的元素</p>
 *
 * @author : 张严
 * @date : 2021-03-31 13:10
 **/
public class No230 {
    static List<Integer> res = new ArrayList<>();
    public static int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return res.get(k-1);

    }
    public static void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }

    public static void main(String[] args) {
        System.out.println(kthSmallest(TreeNode.build("[3,1,4,null,2,null,null,null,null]"),2));
    }
}
