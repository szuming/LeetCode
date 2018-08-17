package offer;

import java.util.ArrayList;

/**
 * 题目描述
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class P23 {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        fun(new ArrayList<Integer>(), root, target, 0);
        return result;
    }

    private void fun(ArrayList<Integer> temp,TreeNode root, int target,int sum) {
        if (root != null) {
            sum = sum + root.val;
            temp.add(root.val);
            if (sum == target && root.left == null && root.right == null) {
                result.add(new ArrayList<>(temp));
            }
            fun(temp, root.left, target, sum);
            fun(temp, root.right, target, sum);
            sum = sum - root.val;
            temp.remove(temp.size() - 1);
        }
    }
}
