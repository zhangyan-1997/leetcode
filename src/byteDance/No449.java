package byteDance;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <h3>leetcode</h3>
 * <p>序列化和反序列化二叉树</p>
 *
 * @author : 张严
 * @date : 2021-05-18 12:03
 **/
public class No449 {
    public String serialize(TreeNode root) {
        if(root == null) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node!=null){
                sb.append(node.val+",");
                queue.offer(node.left);
                queue.offer(node.right);
            }else {
                sb.append("null,");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        return sb.toString();
    }
    public TreeNode deserialize(String data) {
        //数据为空，返回空树
        if(data.equals("[]")) return null;
        String[] vals = data.substring(1, data.length() - 1).split(",");

        //根节点
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(!vals[i].equals("null")){
                node.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.offer(node.left);
            }
            i++;
            if(!vals[i].equals("null")){
                node.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.offer(node.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.build("[2,null,1,null,3,null,null]");
        No449 no449 = new No449();
        System.out.println(no449.serialize(root));
    }
}
