package offer;

/**
 * 二叉树的下一节点
 *
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class P56 {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if (pNode == null)return null;
        if (pNode.right!=null) {
            TreeLinkNode temp = pNode.right;
            while (temp.left!=null){
                temp= temp.left;
            }
            return temp;
        }else{
            TreeLinkNode temp = pNode,parent = pNode.next;
            while (parent!=null&&temp==parent.right){
                temp = temp.next;
                parent=temp.next;
            }
            return parent;
        }
    }
}
