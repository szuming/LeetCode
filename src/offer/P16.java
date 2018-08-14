package offer;

/**
 * 题目描述
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class P16 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            if (checkTree(root1,root2)){
                return true;
            }
        }
        return HasSubtree(root1.left, root2)
                || HasSubtree(root1.right, root2);
    }

    private boolean checkTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return checkTree(root1.left, root2.left)
                && checkTree(root1.right, root2.right);
    }

    public static void main(String[] argv) {
        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(1);
        root1.left.left = new TreeNode(2);
        root1.left.right = new TreeNode(3);
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        P16 temp = new P16();
        System.out.println(temp.HasSubtree(root1, root2));
    }
}
