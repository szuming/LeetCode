package offer;

/**
 * 左旋转字符串
 *
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
public class P42 {
    public String LeftRotateString(String str,int n) {
        if (str==null||str.length()<=0)return "";
        char[] chars = str.toCharArray();
        n = n%str.length();
        int i;
        char[] cp = new char[n];
        for (i = 0; i < n;i++) {
            cp[i] = chars[i];
        }
        for (i = n;i<chars.length;i++) {
            chars[i-n] = chars[i];
        }
        for (i=0;i<n;i++){
            chars[i+chars.length-n] = cp[i];
        }
        return String.valueOf(chars);
    }

    public static void main (String[] args){
        P42 temp = new P42();
        System.out.println(temp.LeftRotateString("1",2));
    }
}
