package offer;

/**
 * 题目描述
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class P11 {
    public double Power(double base, int exponent) {
        boolean flag = true;
        if (exponent < 0) {
            flag = false;
            exponent = -exponent;
        }
        int i;
        double result = 1;
        for (i = 0; i < exponent; i++) {
            result = result * base;
        }
        if (flag)return result;
        else {
            return 1/result;
        }
    }
}
