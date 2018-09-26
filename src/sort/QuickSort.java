package sort;

import java.util.Arrays;

/**
 * @ClassName QuickSort
 * @Description
 * @Author MING
 * @Date 2018/9/25 21:59
 * @Update 2018/9/25 21:59
 **/
public class QuickSort {
    public void quickSort (int[] data,int start,int end){
        if (start == end) return;
        int index = partition(data,start,end);
        if (index > start) quickSort(data,start,index - 1);
        if (index < end) quickSort(data,index + 1,end);
    }

    // 以最后一位作为标准，比它大的放前面去，小的放后面去，返回它最后所在的位置
    private int partition (int[] data,int start,int end){
        if (data.length <= 0 || start < 0 || end > data.length) throw new IllegalArgumentException();
        int small = start - 1, index;
        for (index = start;index < end;index++) {
            if (data[index] < data[end]) {
                small++;
                if (small != index) {
                    swap(data,small,index);
                }
            }
        }
        small++;
        swap(data,small,end);
        return small;
    }

    private void swap (int[] data,int first,int second){
        int temp = data[first];
        data[first] = data[second];
        data[second] = temp;
    }

    public static void main (String[] args){
        QuickSort sort = new QuickSort();
        int[] ints = {5,10,2,7,9,8,6};
        sort.quickSort(ints,0,6);
        System.out.println(Arrays.toString(ints));
    }
}
