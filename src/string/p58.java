package string;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 *
 * 输入: "Hello World"
 * 输出: 5
 */
public class p58 {
    public int lengthOfLastWord(String s) {
        if (s.length()<=0) {
            return 0;
        }
        char[] cp = s.toCharArray();
        int result = 0;
        boolean flag = false;
        for (int i = 0; i < cp.length; i++) {
            if (cp[i] != 32){
                if (flag){
                    result = 0;
                    flag = false;
                }
                result++;
            } else {
                if (! flag) {
                    flag = true;
                }
            }
        }
        return result;
    }

    public static void main(String[] argv){
         p58 temp = new p58();
         System.out.println(temp.lengthOfLastWord("    "));
    }
}
