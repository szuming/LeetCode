package temp;

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
class Solution {
    public int findMaxLength(int[] nums) {
        int left = 0, right = 0, length = nums.length, max = 0, dis = 0, count0 = 0, count1 = 0;
        if (length <= 0)return max;
        for (;left < length; left++) {
            while (length - right < dis) {
                right++;
                if (nums[right] == 0) {
                    count0++;
                } else {
                    count1++;
                }
                dis = Math.abs(count1 - count0);
                if (dis == 0 && max < right - left) {
                    max = right - left;
                }
            }
        }
        return max;
    }
}