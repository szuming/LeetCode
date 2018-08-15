package offer;

/**
 * 题目描述
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class P22 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0)return false;
        return build(sequence);
    }

    public boolean build(int[] sequence) {
        if (sequence.length <= 1)return true;
        int len = sequence.length;
        int root = sequence[len - 1];
        // 寻找右子树开始点
        int left = 0;
        while (left < len && sequence[left] < root) {
            left++;
        }
        // 判断右边是否符合规则
        int right = left;
        for (; right < len; right++) {
            if (sequence[right] < root)return false;
        }
        //检查左子树右子树是否满足二叉搜索数
        int[] leftSeq = new int[left];
        System.arraycopy(sequence, 0, leftSeq, 0, left);
        int[] rightSeq = new int[len - left - 1];
        System.arraycopy(sequence, left , rightSeq, 0, len - left - 1);
        return build(leftSeq) && build(rightSeq);
    }

    public static void main(String[] argv) {
        P22 temp = new P22();
        temp.VerifySquenceOfBST(new int[]{4,6,7,5});
    }
}
