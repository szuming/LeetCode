package offer;

import java.util.ArrayList;
import java.util.Collections;

/***
 *
 字符串的排列
 时间限制：1秒 空间限制：32768K 热度指数：246328
 本题知识点： 字符串
 算法知识视频讲解
 题目描述
 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 输入描述:

 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。


 */
public class P26 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if(null == str || str.length() == 0) {
            return  result;
        }
        int index = 0;
        char[] cp = str.toCharArray();
        fun(result, index, cp);
        Collections.sort(result);
        return result;
    }

    private ArrayList<String> fun(ArrayList<String> result, int index, char[] cp) {
        int len = cp.length;
        if (index <= len - 1) {
            String tempResult = String.valueOf(cp);
            if (!result.contains(tempResult)) {
                result.add(tempResult);
            }
            fun(result, index + 1, cp);
            for (int i = index + 1; i < len; i++) {
                char temp = cp[index];
                cp[index] = cp[i];
                cp[i] = temp;
                tempResult = String.valueOf(cp);
                if (!result.contains(tempResult)) {
                    result.add(tempResult);
                }
                fun(result, index + 1, cp);
                temp = cp[index];
                cp[index] = cp[i];
                cp[i] = temp;
            }
        }
        return result;
    }

    public static void main(String[] argv) {
        P26 temp = new P26();
        ArrayList result = temp.Permutation("123");
    }
}
