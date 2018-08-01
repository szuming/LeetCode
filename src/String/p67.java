package String;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 *
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 */
public class p67 {
    /*public String addBinary(String a, String b) {
        int x = Integer.valueOf(a) + Integer.valueOf(b);
        StringBuilder sb = new StringBuilder();
        int temp, len = a.length() > b.length()?a.length():b.length();
        for (int i = 0; i < len; i++) {
            temp = x % 10;
            x = x / 10;
            if (temp > 1) {
                x++;
                temp = temp - 2;
                if (i == len-1) {
                    sb.insert(0,temp);
                    sb.insert(0,1);
                    break;
                }
            }
            sb.insert(0,temp);
        }
        return sb.toString();
    }*/


    public static void main(String[] argv) {
        p67 temp =new p67();
        System.out.println(temp.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }

    public String addBinary (String a,String b) {
        char[] cp1 = a.toCharArray(), cp2 = b.toCharArray();
        boolean flag = false;
        StringBuilder result = new StringBuilder();
        int i,len = a.length() < b.length()?a.length():b.length();
        for (i = 0; i < len; i++) {
            if (cp1[i] + cp2[i] == '1' + '1') {
                if (flag) {
                    result.insert(0,'1');
                } else {
                    result.insert(0,'0');
                }
                flag = true;
            }
            if (cp1[i] + cp2[i] == '1' + '0') {
                if (flag) {
                    result.insert(0,'0');
                } else {
                    result.insert(0,'1');
                }
            }
            if (cp1[i] + cp2[i] == '0' + '0') {
                if (flag) {
                    result.insert(0,'1');
                    flag = false;
                } else {
                    result.insert(0,'0');
                }
            }
        }
        while (i<cp1.length) {

        }
        return result.toString();
    }
}
