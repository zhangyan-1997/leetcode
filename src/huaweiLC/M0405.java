package huaweiLC;

import utils.TreeNode;

public class M0405 {
    private TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        if(isValidBST(root.left)==false) return false;
        if(pre!= null&&root.val < pre.val) return false;
        pre = root;
        return isValidBST(root.right);
    }
}
