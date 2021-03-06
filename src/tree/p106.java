package tree;



/**
 * 根据一棵树的中序遍历与后序遍历构造二叉树。

 注意:
 你可以假设树中没有重复的元素。

 例如，给出

 中序遍历 inorder = [9,3,15,20,7]
 后序遍历 postorder = [9,15,7,20,3]

 返回如下的二叉树：

 3
 / \
 9  20
 /  \
 15   7


 */
public class p106 {
    private int index;
    public TreeNode buildTree(int[] inorder,int[] postorder) {
        TreeNode root;
        index=postorder.length-1;
        root=getNode(inorder,postorder);
        return root;
    }

    public TreeNode getNode(int[] inorder, int[] postorder){
        if(inorder.length<=0){
            index++;    //当输入为空时
            return null;
        }
        if(inorder.length==1)return new TreeNode(postorder[index]);       //只有一个节点直接返回
        TreeNode node=new TreeNode(postorder[index]);
        //找到inorder中index的位置
        int i,order=-1;
        for(i=0;i<inorder.length;i++){
            if(inorder[i]==postorder[index]){
                order=i;
                break;
            }
        }
        //获得右子树
        int rightNode[]=new int[inorder.length-1-order];
        System.arraycopy(inorder,order+1,rightNode,0,rightNode.length);
        index--;
        node.right=getNode(rightNode,postorder);
        //获得左子树
        int leftNode[]=new int[order];
        System.arraycopy(inorder,0,leftNode,0,leftNode.length);
        index--;
        node.left=getNode(leftNode,postorder);
        return  node;
    }

    public static void main(String argv[]){
        int []inorde={2,1};
        int []postorder={2,1};
        p106 temo=new p106();
        TreeNode root=temo.buildTree(inorde,postorder);
    }
}



