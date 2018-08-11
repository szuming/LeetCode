package offer;

/**
 * @ClassName P6
 * @Description TODO
 * @Author MING
 * @Date 2018/8/11 22:11
 * @Update 2018/8/11 22:11
 **/
public class P6 {
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
        P6 temp = new P6();
        System.out.println(temp.minNumberInRotateArray(new int[]{3,4,5,1,2}));
    }
}
