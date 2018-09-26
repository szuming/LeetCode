package offer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 按之字形顺序打印二叉树
 */
public class P58 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result =new ArrayList<>();
        if (pRoot==null)return result;
        int left = 1,index=0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> tempList = new ArrayList<>();
        queue.add(pRoot);
        while (queue.size()!=0) {
            TreeNode temp = queue.poll();
            if (temp.left!=null){
                index++;
                queue.addLast(temp.left);
            }
            if (temp.right!=null){
                index++;
                queue.addLast(temp.right);
            }
            tempList.add(temp.val);
            left--;
            if (left==0) {
                result.add(new ArrayList<>(tempList));
                tempList = new ArrayList<>();
                left = index;
                index=0;
            }
        }
        return result;
    }

    public static void main (String[] args){
        P58 temp = new P58();
        TreeNode root =new TreeNode(5);
        root.left = new TreeNode(6);
        root.left.left= new TreeNode(7);
        root.left.left.left= new TreeNode(8);
        temp.Print(root);
    }
}
