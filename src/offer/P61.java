package offer;

/**
 * 二叉树的第k个节点
 *
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 */
public class P61 {
    int index;
    TreeNode KthNode(TreeNode pRoot, int k){
        if (pRoot==null)return null;
        TreeNode left = KthNode(pRoot.left,k);
        if (left!=null)return left;
        index++;
        if (index==k)return pRoot;
        TreeNode right = KthNode(pRoot.right,k);
        if (right!=null)return right;
        return null;
    }

    public static void main (String[] args){
        P61 temp = new P61();
        TreeNode root =new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);
        temp.KthNode(root,1);
    }
}
