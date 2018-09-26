package offer;

/**
 *  字符串转整数
 *
 *  将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
 *  要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 */
public class P48 {
    public int StrToInt (String str){
        if (str == null || str.length() == 0) return 0;
        long result = 0;
        int flag = 1, index = 0;
        char[] chars = str.toCharArray();
        if (chars[index] == '-') {
            flag = - 1;
            index++;
        }else if (chars[index] == '+') {
            index++;
        }
        while (index < chars.length) {
            if (chars[index] >= '0' && chars[index] <= '9') {
                result = result * 10 + (chars[index] - '0');
            }else {
                return 0;
            }
            index++;
        }
        return (int)(flag * result);
    }

    public static void main (String[] args){
        P48 temp =new P48();
        System.out.println(temp.StrToInt("1a48"));
    }
}
