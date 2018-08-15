package offer;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
public class P20 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int len1 = pushA.length, len2 = popA.length;
        if (len1 == 0 || len2 == 0)return false;
        if (len1 == len2 && len1 == 1) {
            if (pushA[0] != popA[0])return false;
        }
        Stack<Integer> stack = new Stack<>();
        int i = 0, k;
        stack.push(pushA[i++]);
        for (k = 0; k < len2; k++) {
            if (stack.peek() != popA[k]) {
                if (i >= len1)return false;
                while (pushA[i] != popA[k]){
                    stack.push(pushA[i++]);
                    if (i >= len1)return false;
                }
                i++;
            } else {
                stack.pop();
            }
        }
        return true;
    }

    public static void main(String[] argv) {
        P20 temp = new P20();
        System.out.println(temp.IsPopOrder(new int[]{1,2,3,4,5}, new int[]{4,5,3,2,1}));
    }
}
