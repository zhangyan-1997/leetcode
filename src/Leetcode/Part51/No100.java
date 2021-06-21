package Leetcode.Part51;
import utils.TreeNode;
/**
 * <h3>leetcode</h3>
 * <p>相同的树</p>
 *
 * @author : 张严
 * @date : 2021-03-30 21:04
 **/
public class No100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }

    public static void main(String[] args) {
        System.out.println(isSameTree(TreeNode.build("[]"), TreeNode.build("[]")));
    }
}
