package offer;

/**
 * 数字在排序数组的出现次数
 * <p>
 * 统计一个数字在排序数组中出现的次数
 */
public class P36 {
    public int GetNumberOfK (int[] array,int k){
        int mid, left = -1, right = -1, i = 0, j = array.length - 1;
        while (i <= j) {
            mid = (i + j) / 2;
            if (array[mid] == k) {
                if (mid - 1 >= 0 && array[mid - 1] == k) {
                    j = mid - 1;
                }else {
                    left = mid;
                    break;
                }
            }else if (array[mid] < k) {
                i = mid + 1;
            }else {
                j = mid - 1;
            }
        }
        i = 0;
        j = array.length - 1;
        while (i <= j) {
            mid = (i + j) / 2;
            if (array[mid] == k) {
                if (mid + 1 < array.length && array[mid + 1] == k) {
                    i = mid + 1;
                }else {
                    right = mid;
                    break;
                }
            }else if (array[mid] < k) {
                i = mid + 1;
            }else {
                j = mid - 1;
            }
        }
        return right == -1 && left == -1?0:right - left + 1;
    }

    public static void main (String[] args){
        P36 temp = new P36();
        System.out.println(temp.GetNumberOfK(new int[] {2},2));
    }
}
