package offer;

import java.util.ArrayList;


/**
 *
 时间限制：1秒 空间限制：32768K 热度指数：278909
 本题知识点： 数组
 算法知识视频讲解
 题目描述
 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。

 */
public class P28 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input,int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] maxHeap = new int[k];
        int i;
        if (input.length < k || k == 0) {
            return result;
        }
        for (i = 0; i < k ;i++) {
            maxHeap[i] = input[i];
        }
        build(maxHeap);
        for (; i < input.length; i++) {
            if (maxHeap[0] > input[i]) {
                maxHeap[0] = input[i];
            }
            build(maxHeap);
        }
        for (i = 0; i < k; i++) {
            result.add(maxHeap[i]);
        }
        return result;
    }

    private void build(int[] maxHeap) {
        for (int i = (int) Math.floor(maxHeap.length / 2); i >= 0; i--) {
            heapify(maxHeap, i, maxHeap.length);
        }
    }

    private void heapify(int[] maxHeap, int i, int len) {
        int max = i, left, right;
        if ((left = (i * 2) + 1) < len) {
            if (maxHeap[i] < maxHeap[left]) {
                max = left;
            }
        }
        if ((right = (i * 2) + 2) < len) {
            if (maxHeap[i] < maxHeap[right]) {
                max = right;
            }
        }
        if (max != i) {
            swap(maxHeap, max, i);
            heapify(maxHeap, max, len);
        }
    }

    private void swap(int[] maxHeap, int i, int j) {
        int temp = maxHeap[i];
        maxHeap[i] = maxHeap[j];
        maxHeap[j] = temp;
    }

    public static void main (String[] args){
        P28 p28 = new P28();
        p28.GetLeastNumbers_Solution(new int[]{4,5}, 4);
    }
}
