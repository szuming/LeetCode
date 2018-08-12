package offer;

/**
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 *
 * n<=39
 */
public class P9 {
    public int Fibonacci(int n) {
        int first = 0, second = 1;
        int i = 1;
        if (n <= 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        int result = 0;
        while (i <  n) {
            result = first + second;
            first = second;
            second = result;
            i++;
        }
        return result;
    }
}
