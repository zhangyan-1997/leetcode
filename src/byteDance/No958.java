package byteDance;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <h3>leetcode</h3>
 * <p>二叉树的完全性检验</p>
 *
 * @author : 张严
 * @date : 2021-05-14 15:01
 **/
public class No958 {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = false;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left!=null){
                if(flag == true) return false;
                queue.offer(node.left);
            }else flag = true;
            if(node.right!=null){
                if(flag == true) return false;
                queue.offer(node.right);
            }
            else flag = true;
        }
        return true;

    }
}
