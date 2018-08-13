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

    /**
     * 跳楼梯
     * @param target
     * @return
     */
    public int JumpFloor(int target) {
        int first = 1, second = 2, res = 0;
        int i = 3;
        if (target <= 0) {
            return first;
        }
        else if (target == 1) {
            return second;
        }
        int result = 0;
        while (i <=  target) {
            result = first + second;
            first = second;
            second = result;
            i++;
        }
        return result;
    }

    /**
     * 变态跳楼梯
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        if (target <= 0) {
            return -1;
        } else if (target == 1) {
            return 1;
        } else {
            return 2 * JumpFloorII(target - 1);
        }
    }

    /**
     * 覆盖矩形
     * @param target
     * @return
     */
    public int RectCover(int target) {
        int result = 0;
        int first = 1 , second = 2;
        if(target < 1) {
            return 0;
        } else if (target == 1) {
            return 1;
        } else if (target == 2){
            return 2;
        }
        for (int i = 0; i < target; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
