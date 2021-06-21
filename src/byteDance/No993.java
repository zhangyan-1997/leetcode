package byteDance;

import utils.TreeNode;

import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.Queue;

/**
 * <h3>leetcode</h3>
 * <p>二叉树的堂兄弟节点</p>
 *
 * @author : 张严
 * @date : 2021-05-19 18:14
 **/
public class No993 {
    public boolean isCousins(TreeNode root, int x, int y) {
        int[] res_x = bfs(root,x);
        int[] res_y = bfs(root,y);
        //0处存放的父节点的值，1处存放的深度
        return res_x[0]!=res_y[0]&&res_x[1]==res_y[1];

    }
    public int[] bfs(TreeNode root,int t){
        if(root == null) return new int[0];
        Queue<Object[]> queue = new LinkedList<>();
        queue.offer(new Object[]{root,null,0});
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Object[] node = queue.poll();

                TreeNode cur = (TreeNode)node[0];
                TreeNode fa = (TreeNode)node[1];
                int depth = (int)node[2];

                if(cur.val==t) return new int[]{fa!=null?fa.val:0,depth};
                if(cur.left!=null) queue.offer(new Object[]{cur.left,cur,depth+1});
                if(cur.right!=null) queue.offer(new Object[]{cur.right,cur,depth+1});
            }
        }
        return new int[]{-1,-1};
    }

    public int[] dfs(TreeNode root,TreeNode fa,int depth, int t){
        if(root==null) return new int[]{-1,-1};
        if(root.val == t) return new int[]{fa!=null?fa.val:0,depth};
        int[] left = dfs(root.left,root,depth+1,t);
        if(left[0]!=-1) return left;
        return dfs(root.right,root,depth+1,t);
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.build("[1,2,3,null,4,null,5,null,null,null,null]");
        No993 no993 = new No993();
        System.out.println(no993.isCousins(root, 5, 4));
    }
}
