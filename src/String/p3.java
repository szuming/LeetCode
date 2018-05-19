package String;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。

 示例：

 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。

 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。

 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。

 */
public class p3 {
    public int lengthOfLongestSubstring(String s) {
        int result=0,count=0;
        char array[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            count=0;
            Map<Character,Integer> map=new HashMap<>();
            if(s.length()-i-1<result)return result;
            for(int j=i;j<s.length();j++){
                if(!map.containsKey(array[j])){             //如果不在map中
                    map.put(array[j],1);
                    count++;
                }else{
                    if(result<count){                       //在map中要判断是否更新result
                        result=count;
                    }
                    break;
                }
                if(j==s.length()-1&&result<count){          //到了尽头要判断是否更新result
                    result=count;
                }
            }
        }
        return result;
    }

    public static void main(String[] argv){
        p3 temp=new p3();
        System.out.println(temp.lengthOfLongestSubstring(""));
    }

}
