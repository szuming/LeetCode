package offer;




/**
 * 对称二叉树
 */
public class P57 {
    boolean isSymmetrical(TreeNode pRoot){
        return fun(pRoot,pRoot);
    }

    boolean fun(TreeNode first,TreeNode second){
        if (first==null&&second==null){
            return true;
        }
        if (first == null || second == null){
            return false;
        }
        if (first.val!=second.val){
            return false;
        }
        return fun(first.left,second.right)&&fun(first.right,second.left);
    }

}
