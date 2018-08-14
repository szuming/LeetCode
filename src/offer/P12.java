package offer;

/**
 * 题目描述
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class P12 {
    public void reOrderArray(int [] array) {
        int i = 0, len = array.length, j = 0, k, temp;
        if (len <= 1)return;
        while (i < len && array[i] % 2 == 0)i++;
        while (j < len && array[j] % 2 != 0)j++;
        for (; i < len && j < len; i++) {
            if (array[i] % 2 != 0 && i > j) {
                temp = array[i];
                for (k = i; k > j; k--) {
                    array[k] = array[k - 1];
                }
                array[k] = temp;
                j++;
            }
        }
    }

    public static void main(String[] argv) {
        P12 temp = new P12();
        temp.reOrderArray(new int[]{1,2,3,4,5,6,7});
    }
}
