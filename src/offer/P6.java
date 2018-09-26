package offer;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 */
public class P6 {
    private int i;
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        i = 0;
        return build(pre, in);
    }

    private TreeNode build(int[] pre, int[] in) {
        if (in.length == 0) {
            i--;
            return null;
        }
        if (in.length == 1) {
            return new TreeNode(pre[i]);
        }
        int rootValue = pre[i], index;
        // 从中序遍历中找到左右子数分离点
        for (index = 0; index < in.length; index++) {
            if (in[index] == rootValue) {
                break;
            }
        }
        // 得到左右子树数组
        int[] left = new int[index], right = new int[in.length - index - 1];
        System.arraycopy(in, 0 , left, 0, index);
        System.arraycopy(in, index + 1, right, 0 , in.length - index-1);
        TreeNode treeNode = new TreeNode(pre[i]);
        i++;
        treeNode.left = build(pre, left);
        i++;
        treeNode.right = build(pre, right);
        return treeNode;
    }

    public static void main(String[] argv) {
        P6 p4 = new P6();
        p4.build(new int[]{1,2,3,4,5,6,7},new int[]{3,2,4,1,6,5,7});
    }
}
