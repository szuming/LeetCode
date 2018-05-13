package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，返回它的 后序 遍历。

 示例:

 输入: [1,null,2,3]
 1
 \
 2
 /
 3

 输出: [3,2,1]

 进阶: 递归算法很简单，你可以通过迭代算法完成吗？

 */
public class p145 {
    List<Integer> result=new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)return result;         //空树直接返回
        //recursive(root);        //递归
        iterative(root);        //迭代
        return result;
    }

    //递归解
    public void recursive(TreeNode treeNode){
        if(treeNode==null)return;
        recursive(treeNode.left);
        recursive(treeNode.right);
        result.add(treeNode.val);
    }

    //迭代
    public void iterative(TreeNode root){
        TreeNode node=root;
        Stack<TreeNode> stack=new Stack<>();
        HashMap<TreeNode,Boolean> map=new HashMap<>();
        stack.push(root);                    //根节点入栈
        map.put(node,true);
        while(!stack.empty()) {              //当栈不为空时进行迭代
            node=stack.peek();
            while(node.left!=null||node.right!=null){                   //当不为叶子时遍历，每次查找一条遍历路径
                if(node.left!=null&&!map.containsKey(node.left)){       //左子树不空且未被遍历过时
                    stack.push(node.left);
                    map.put(node.left,true);
                    node=node.left;
                    continue;
                }
                if(node.right!=null&&!map.containsKey(node.right)){     //右子树不空且未被遍历过时
                    stack.push(node.right);
                    map.put(node.right,true);
                    node=node.right;
                }else{
                    break;
                }
            }
            node=stack.pop();           //出栈
            result.add(node.val);       //添加到结果链表
        }
    }


    public static void main(String argv[]){
        p145 temp=new p145();
        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        for(Integer i:temp.postorderTraversal(root)){
            System.out.println(i);
        }

    }
}
