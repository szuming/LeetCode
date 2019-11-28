package string;

/**
 * 28. 实现strStr()
 * 题目描述提示帮助提交记录社区讨论阅读解答
 *
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 *
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 * 说明:
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */
public class p28{
    public int strStr(String haystack, String needle) {
        char[] cp1=haystack.toCharArray(),cp2=needle.toCharArray();
        if(cp2.length==0)return 0;
        int i;
        for(i=0;i<cp1.length;i++){
            if(cp1[i]==cp2[0]){
                int k=0;
                for(;i+k<cp1.length&&k<cp2.length;k++){
                    if(cp1[i+k]!=cp2[k])break;
                }
                if(k==cp2.length)return i;
            }
        }
        return -1;
    }
}

