package offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 题目描述
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class P21 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>(32);
        ArrayList<TreeNode> queue = new ArrayList<>();
        if (root == null)return result;
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.remove(0);
            result.add(root.val);
            if (root.left != null){
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }
        }
        return result;
    }
}
