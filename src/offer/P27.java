package offer;

import java.util.Arrays;

/**
 *
 数组中出现次数超过一半的数字
 时间限制：1秒 空间限制：32768K 热度指数：214587
 本题知识点： 数组
 算法知识视频讲解
 题目描述
 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。

 */
public class P27 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len = array.length, i , j, mid = len / 2 - 1;
        if (len <= 0)return 0;
        if (len == 1)return array[0];
        Arrays.sort(array);
        int count = 0;
        boolean iflag = true, jflag = true;
        for (i = mid + 1 , j = mid - 1; iflag || jflag;) {
            if (j >= 0 && array[j] == array[mid]) {
                j --;
                count++;
            } else {
                jflag = false;
            }
            if (i < len && array[i] == array[mid]) {
                i++;
                count++;
            } else {
                iflag = false;
            }
        }
        return count > mid ? array[mid] : 0;
    }

    public static void main(String[] argv) {
        P27 temp = new P27();
        System.out.println(temp.MoreThanHalfNum_Solution(new int[]{}));
    }
}
