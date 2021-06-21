package Leetcode.Part101;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>路径总和3</p>
 *
 * @author : 张严
 * @date : 2021-05-14 14:26
 **/
public class No113 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null) return res;
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        dfs(root,targetSum,root.val,list);
        return res;
    }
    public void dfs(TreeNode root, int targetSum, int sum, List<Integer> list){

        if(root.left==null&&root.right==null&&targetSum==sum){
            res.add(new ArrayList<>(list));
            return;
        }

        if(root.left!=null){
            list.add(root.left.val);
            dfs(root.left,targetSum,sum+root.left.val,list);
            list.remove(list.size()-1);
        }
        if(root.right!=null){
            list.add(root.right.val);
            dfs(root.right,targetSum,sum+root.right.val,list);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        TreeNode tree = TreeNode.build("[1,2,3,null,null,null,null]");
        No113 no113 = new No113();
        List<List<Integer>> res1 = no113.pathSum(tree, 3);
        System.out.println(res1);
    }
}
