package Leetcode.Part101;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>二叉树的前序遍历</p>
 *
 * @author : 张严
 * @date : 2021-05-14 21:08
 **/
public class No144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (!stack.isEmpty()||p!=null){
            if(p!=null) {
                res.add(p.val);
                stack.push(p);
                p = p.left;
            }else {
                p = stack.pop();
                p = p.right;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode tree = TreeNode.build("[1,null,2,3,null,null,null]");
        No144 no144 = new No144();
        System.out.println(no144.preorderTraversal(tree));
    }

}
