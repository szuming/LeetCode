package offer;
import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class P19 {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> anotherStack = new Stack<>();
    int min = Integer.MAX_VALUE;

    public void push(int node) {
        if (min > node)min = node;
        stack.push(node);
        anotherStack.push(min);
    }

    public void pop() {
        stack.pop();
        anotherStack.pop();
        min = anotherStack.peek();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return anotherStack.peek();
    }
}
