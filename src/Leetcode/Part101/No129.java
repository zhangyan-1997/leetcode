package Leetcode.Part101;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>求根节点到叶节点数字之和</p>
 *
 * @author : 张严
 * @date : 2021-05-14 15:22
 **/
public class No129 {
    List<String> res = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        StringBuilder sb = new StringBuilder();
        sb.append(root.val+"");
        dfs(root,sb);
        int count = 0;
        for (String s:res) {
            count = count + Integer.parseInt(s);
        }
        return count;
    }
    public void dfs(TreeNode root,StringBuilder sb){
        if(root.left == null&&root.right == null) {
            res.add(sb.toString());
            return;
        }
        if(root.left!=null){
            sb.append(root.left.val+"");
            dfs(root.left,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(root.right!=null){
            sb.append(root.right.val+"");
            dfs(root.right,sb);
            sb.deleteCharAt(sb.length()-1);
        }

    }

    public static void main(String[] args) {
        TreeNode tree = TreeNode.build("[4,9,0,5,1,null,null,null,null,null,null]");
        No129 no129 = new No129();
        System.out.println(no129.sumNumbers(tree));
    }
}
