package Leetcode;

import utils.TreeNode;

import java.util.HashMap;

/**
 * <h3>leetcode</h3>
 * <p>路径总和3</p>
 *
 * @author : 张严
 * @date : 2021-04-19 14:47
 **/
public class No437 {
    private HashMap<Integer,Integer> map;
    public int pathSum(TreeNode root, int targetSum) {
        map = new HashMap<>();
        map.put(0,1);
        return dfs(root,0,targetSum);
    }
    private int dfs(TreeNode root,int sum,int targetSum){
        if(root==null) return 0;
        int res =0;
        sum = sum + root.val;
        //如果此前存在sum-targetSum,当前为sum，因此就存在子路径为targetSum
        res = map.getOrDefault(sum-targetSum,0);
        map.put(sum,map.getOrDefault(sum,0)+1);
        res = res + dfs(root.left,sum,targetSum);
        res = res + dfs(root.right,sum,targetSum);
        map.put(sum,map.get(sum)-1);
        return res;
    }

    public static void main(String[] args) {
        No437 no437 = new No437();
        System.out.println(no437.pathSum(TreeNode.build("[0,1,1,null,null,null,null]"),1));
    }
}
