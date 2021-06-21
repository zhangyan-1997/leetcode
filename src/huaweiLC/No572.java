package huaweiLC;

import utils.TreeNode;

/**
 * <h3>leetcode</h3>
 * <p>另一个数的子树</p>
 *
 * @author : 张严
 * @date : 2021-06-21 15:56
 **/
/*
public class No572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if()
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;
        return ((root.val == subRoot.val)&&isSubtree(root.left, subRoot.left)&&isSubtree(root.right, subRoot.right))
                ||isSubtree(root.left,subRoot) ||isSubtree(root.right,subRoot);
    }

    public static void main(String[] args) {
        TreeNode subRoot = TreeNode.build("[4,1,2,null,null,null,null]");
        TreeNode root = TreeNode.build("[3,4,5,1,2,null,null,null,null,0,null,null,null]");
        No572 no572 = new No572();
        System.out.println(no572.isSubtree(root, subRoot));
    }
}


 */