package offer;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class P47 {
    public int Add(int num1,int num2) {
        int first,second;
        do {
            first = num1 ^num2;
            second = (num1&num2)<<1;
            num1 = first;
            num2 = second;
        }while ((num2!=0));
        return num1;
    }
}
