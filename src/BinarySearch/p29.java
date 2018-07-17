package BinarySearch;

/**
 * 29. 两数相除
 * 题目描述提示帮助提交记录社区讨论阅读解答
 *
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 *
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 *
 * 示例 1:
 *
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 *
 * 示例 2:
 *
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 *
 * 说明:
 *
 *     被除数和除数均为 32 位有符号整数。
 *     除数不为 0。
 *     假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。本题中，如果除法结果溢出，则返回 231 − 1。
 *     -2147483648
 * -1
 * 输出： 0
 * 预期： 2147483647
 */
public class p29{
    public int divide(int dividend, int divisor) {
        int i=0,sum=0,flag=1;
        if(divisor<0&&dividend>=0){
            flag=-1;
            divisor=-divisor;
        }else if(dividend<0&&divisor>0){
            flag=-1;
            dividend=-dividend;
        }else if(dividend<0&&divisor<0){
            dividend=-dividend;
            divisor=-divisor;
        }
        if(dividend==-2147483648&&divisor==1){
            if(flag==-1)return -2147483648;
            return 2147483647;
        }
        sum=divisor;
        while(sum<=dividend){
            sum=sum+divisor;
            i++;
        }
        return i*flag;
    }

    public static void main(String[] argv){
        p29 temp=new p29();
        System.out.println(temp.divide(-2147483648,1));
    }
}
