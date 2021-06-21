package byteDance;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <h3>leetcode</h3>
 * <p>在每个树行中找最大值</p>
 *
 * @author : 张严
 * @date : 2021-05-18 11:10
 **/
public class No515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i=0;i<size;i++){
                TreeNode node = queue.poll();
                max = Math.max(max,node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            res.add(max);
        }
        return res;
    }
}
