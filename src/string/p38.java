package string;

/**
 * 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 *
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 *
 * 给定一个正整数 n ，输出报数序列的第 n 项。
 *
 * 注意：整数顺序将表示为一个字符串。
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: "1"
 *
 * 示例 2:
 *
 * 输入: 4
 * 输出: "1211"
 */
public class p38{
    public String countAndSay(int n) {
        if (n <= 0)return "1";
        int count=-1,i,j;
        char c = 0;
        StringBuilder sb = new StringBuilder("1");
        for (i = 1; i < n; i++){
            StringBuilder temp = new StringBuilder();
            for (j = 0; j < sb.length(); j++){
                if (j == 0) {
                    c = sb.charAt(j);
                    count=1;
                } else{
                    if (c != sb.charAt(j)) {
                        temp.append(count);
                        temp.append(c);
                        c =  sb.charAt(j);
                        count = 1;
                    }else {
                        count++;
                    }
                }
            }
            temp.append(count);
            temp.append(c);
            sb = new StringBuilder(temp);
        }
        return sb.toString();
    }

    public static void main(String[] argv){
        p38 temp = new p38();
        System.out.println(temp.countAndSay(5));
    }
}
