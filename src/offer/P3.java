package offer;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class P3 {
    public boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }
        int n = array.length, m = array[0].length, i, j;
        for (i = 0, j = m - 1; i < n && j >= 0;) {
            if (array[i][j] > target) {
                j--;
            }else if (array[i][j] == target) {
                return true;
            }else {
                i++;
            }
        }
        return false;
    }
}
