package offer;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * 字符串中第一个只出现一次的字符位置
 *
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
public class P33 {
    public int FirstNotRepeatingChar(String str) {
        if (str.length()<=0)return -1;
        int i;
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>(str.length());
        char[] chars = str.toCharArray();
        for (i = 0;i < str.length();i++) {
            map.merge(chars[i],1,(a,b) -> a + b);
        }
        i = 0;
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return str.indexOf(entry.getKey());
            }
            i++;
        }
        return -1;
    }

    public static void main (String[] args){
        P33 temp = new P33();
        System.out.println(temp.FirstNotRepeatingChar("google"));
    }
}
