package offer;

import java.util.Arrays;

/**
 * 输入一个正整数数组，
 * 把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class P31 {
    public String PrintMinNumber(int [] numbers) {
        if (numbers.length == 0) {
            return "";
        } else if (numbers.length == 1) {
            return String.valueOf(numbers[0]);
        }
        String[] sbs = new String[numbers.length];
        for (int i = 0; i  < numbers.length; i++) {
            sbs[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(sbs,(o1,o2) -> {
            String first = o1 + o2;
            String second = o2 + o1;
            return first.compareTo(second);
        });
        StringBuilder sb = new StringBuilder();
        for (int j = 0;j < numbers.length;j++) {
            sb.append(sbs[j]);
        }
        return sb.toString();
    }

    public static void main (String[] args){
        P31 temp = new P31();
        System.out.println(temp.PrintMinNumber(new int[]{3,32,321}));
    }
}
