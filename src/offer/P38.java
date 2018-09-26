package offer;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class P38 {
    public boolean IsBalanced_Solution (TreeNode root){
        return test(root,new int[1]);
    }

    private boolean test (TreeNode root,int[] nodeDepth){
        if (root == null) {
            nodeDepth[0] = 0;
            return true;
        }else {
            int[] left = new int[1],right = new int[1];
            if (test(root.left,left) && test(root.right,right)) {
                int diff = left[0] - right[0];
                if (diff <= 1 && diff >= - 1) {
                    nodeDepth[0] =1+ (left[0]>right[0]?left[0]:right[0]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main (String[] args){

    }
}


