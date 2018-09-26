package offer;

import java.util.Stack;

/**
 * 题目描述
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class P7 {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] argv) {
        P7 temp = new P7();
        temp.push(1);
        temp.push(2);
        temp.push(3);
        System.out.println(temp.pop());
        System.out.println(temp.pop());
        System.out.println(temp.pop());
        temp.push(4);
        temp.push(5);
        System.out.println(temp.pop());
    }
}
