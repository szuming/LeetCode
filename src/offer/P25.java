package offer;

/**
 *
 二叉搜索树与双向链表
 时间限制：1秒 空间限制：32768K 热度指数：158974
 算法知识视频讲解
 题目描述
 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class P25 {
    public TreeNode Convert(TreeNode pRootOfTree){
        if (pRootOfTree == null) {
            return null;
        }
        if (pRootOfTree.left != null) fun(pRootOfTree.left).right = pRootOfTree;
        if (pRootOfTree.right != null) fun(pRootOfTree.right).right = pRootOfTree;
    }

    private TreeNode fun(TreeNode node) {

    }
}
