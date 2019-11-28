package HashTable;

import java.util.HashMap;

/**
 * 给定一个二进制数组, 找到含有相同数量的 0 和 1 的最长连续子数组（的长度）。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [0,1]
 * 输出: 2
 * 说明: [0, 1] 是具有相同数量0和1的最长连续子数组。
 * 示例 2:
 *
 * 输入: [0,1,0]
 * 输出: 2
 * 说明: [0, 1] (或 [1, 0]) 是具有相同数量0和1的最长连续子数组。
 *  
 *
 * 注意: 给定的二进制数组的长度不会超过50000。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/contiguous-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P525 {
    /**
     * count代表的是当前数组和，用countMap记录每一个和第一次出现的位置，等到再遇到这个和的时候就说明当前位置到第一次出现的位置的数组是一个连续子数组
     *
     * @param nums
     * @return
     */
    public int findMaxLength(int[] nums) {
        if (nums.length <= 0) return 0;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int i = 0, len = nums.length, count = 0, max = 0;
        // 和为0记录的是-1是因为遍历的索引从0开始
        countMap.put(count, -1);
        for (; i < len; i++) {
            count = count + (nums[i] == 0 ? 1 : -1);
            if (countMap.containsKey(count)) {
                max = Math.max(max, i - countMap.get(count));
            } else {
                countMap.put(count, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        P525 temp = new P525();
        int[] input = {0,1};
        System.out.println(temp.findMaxLength(input));
    }
}
