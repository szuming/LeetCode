package offer;

/**
 * @ClassName P60
 * @Description
 * @Author MING
 * @Date 2018/9/22 18:41
 * @Update 2018/9/22 18:41
 **/
public class P60 {
    int index;
    String Serialize(TreeNode root) {
        if (root==null)return "#";
        return root.val+","+Serialize(root.left)+","+Serialize(root.right);
    }


    TreeNode Deserialize(String str) {
        String[] strs = str.split(",");
        return fun(strs);
    }

    private TreeNode fun(String[] str) {
        if (index>=str.length){
            return null;
        }
        if (str[index].equals("#")){
            return null;
        }
        TreeNode temp = new TreeNode(Integer.valueOf(str[index]));
        index++;
        temp.left = fun(str);
        index++;
        temp.right = fun(str);
        return temp;
    }

    public static void main (String[] args){
        P60 temp = new P60();
        TreeNode root =new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);
        String serialize = temp.Serialize(root);
        temp.Deserialize(serialize);
    }
}
