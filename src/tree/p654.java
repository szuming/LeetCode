package tree;

import sun.reflect.generics.tree.Tree;

/**
 * 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：

 二叉树的根是数组中的最大元素。
 左子树是通过数组中最大值左边部分构造出的最大二叉树。
 右子树是通过数组中最大值右边部分构造出的最大二叉树。

 通过给定的数组构建最大二叉树，并且输出这个树的根节点。

 Example 1:

 输入: [3,2,1,6,0,5]
 输入: 返回下面这棵树的根节点：

 6
 /   \
 3     5
 \    /
 2  0
 \
 1

 注意:

 给定的数组的大小在 [1, 1000] 之间。


 */
public class p654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
            if(nums.length==0)return null;
            if(nums.length==1)return new TreeNode(nums[0]);
            TreeNode root=null;
            root=buildTree(nums);
            return root;
    }

    public TreeNode buildTree(int []nums){
        if(nums.length==0)return null;
        int i,max=0,maxIndex=-1;
        for(i=0;i<nums.length;i++){     //找到最大值
            if(max<nums[i]){
                max=nums[i];
                maxIndex=i;
            }
        }
        TreeNode node=new TreeNode(nums[maxIndex]);
        //左子树数组
        int leftTree[]=new int[maxIndex];
        System.arraycopy(nums,0,leftTree,0,leftTree.length);
        //右子树数组
        int rightTree[]=new int[nums.length-maxIndex-1];
        System.arraycopy(nums,maxIndex+1,rightTree,0,rightTree.length);
        node.left=buildTree(leftTree);
        node.right=buildTree(rightTree);
        return node;
    }
}
