package offer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 按之字形打印二叉树
 */
public class P59 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result =new ArrayList<>();
        if (pRoot==null)return result;
        boolean flag =false;
        int left = 1,index=0;
        LinkedList<TreeNode> firstStack = new LinkedList<>();
        LinkedList<TreeNode> secondStack = new LinkedList<>();
        ArrayList<Integer> tempList = new ArrayList<>();
        firstStack.add(pRoot);
        while (firstStack.size()!=0||secondStack.size()!=0) {
            if (flag){
                TreeNode temp = secondStack.pop();
                if (temp.right!=null){
                    index++;
                    firstStack.push(temp.right);
                }
                if (temp.left!=null){
                    index++;
                    firstStack.push(temp.left);
                }
                tempList.add(temp.val);
            }else {
                TreeNode temp = firstStack.pop();
                if (temp.left!=null){
                    index++;
                    secondStack.push(temp.left);
                }
                if (temp.right!=null){
                    index++;
                    secondStack.push(temp.right);
                }
                tempList.add(temp.val);
            }
            left--;
            if (left==0) {
                flag=!flag;
                result.add(new ArrayList<>(tempList));
                tempList = new ArrayList<>();
                left = index;
                index=0;
            }
        }
        return result;
    }


    public static void main (String[] args){
        P59 temp = new P59();
        TreeNode root =new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);
        temp.Print(root);
    }
}
