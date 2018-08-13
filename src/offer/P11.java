package offer;

/**
 * @ClassName P11
 * @Description TODO
 * @Author MING
 * @Date 2018/8/13 22:43
 * @Update 2018/8/13 22:43
 **/
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
