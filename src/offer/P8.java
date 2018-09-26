package offer;

/**
 * 题目描述
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class P8 {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0)return 1;
        if (array[0] < array[array.length - 1])return array[0];
        int len = array.length, i = 0, j = len - 1, mid = i;
        while (array[i] >= array[j]) {
            if (j - i == 1) {
                mid = j;
                break;
            }
            mid = (i + j) / 2;
            if (array[i] == array[mid] && array[mid] == array[j]) {
                int min = Integer.MAX_VALUE;
                for (i++; i < j; i++) {
                    if (min < array[i])min = array[i];
                }
                return min;
            }
            if (array[mid] >= array[i]) {
                i = mid;
            } else {
                j = mid;
            }
        }
        return array[mid];
    }

    public static void main(String[] argv) {
        P8 temp = new P8();
        System.out.println(temp.minNumberInRotateArray(new int[]{3,4,5,1,2}));
    }
}
