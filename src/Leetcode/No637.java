package Leetcode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import utils.TreeNode;
/**
 * <h3>leetcode</h3>
 * <p>二叉树的层平均值</p>
 *
 * @author : 张严
 * @date : 2021-03-31 10:22
 **/
public class No637 {
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            double sum =0;
            int count = queue.size();
            for(int i=count;i>0;i--){
                TreeNode t = queue.poll();
                sum = sum+t.val;
                if(t.left!=null) queue.offer(t.left);
                if(t.right!=null) queue.offer(t.right);
            }
            res.add(sum/count);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(averageOfLevels(TreeNode.build("[3,9,20,null,null,15,7,null,null,null,null]")));
    }
}
