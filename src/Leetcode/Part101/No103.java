package Leetcode.Part101;

import java.util.*;
import utils.TreeNode;
/*二叉树的锯齿形遍历
Date:
 */
public class No103 {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            for(int i =queue.size();i>0;i--){
                TreeNode t = queue.poll();
                list.add(t.val);
                if(t.left!=null) queue.offer(t.left);
                if(t.right!=null) queue.offer(t.right);
            }
            if(!flag) Collections.reverse(list);
            flag = !flag;
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.build("[3,9,20,null,null,15,7,null,null,null,null]");
        System.out.println(zigzagLevelOrder(root));
    }
}
