package Array;

/**
 * 给你一个正整数的数组 A（其中的元素不一定完全不同），请你返回可在 一次交换（交换两数字 A[i] 和 A[j] 的位置）后得到的、按字典序排列小于 A 的最大可能排列。
 *
 * 如果无法这么操作，就请返回原数组。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[3,2,1]
 * 输出：[3,1,2]
 * 解释：
 * 交换 2 和 1
 *  
 *
 * 示例 2：
 *
 * 输入：[1,1,5]
 * 输出：[1,1,5]
 * 解释：
 * 这已经是最小排列
 *  
 *
 * 示例 3：
 *
 * 输入：[1,9,4,6,7]
 * 输出：[1,7,4,6,9]
 * 解释：
 * 交换 9 和 7
 *  
 *
 * 示例 4：
 *
 * 输入：[3,1,1,3]
 * 输出：[1,3,1,3]
 * 解释：
 * 交换 1 和 3
 *  
 *
 * 提示：
 *
 * 1 <= A.length <= 10000
 * 1 <= A[i] <= 10000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/previous-permutation-with-one-swap
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class P1221 {
    public int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        int count = 0, balance = 0;
        for (char aChar : chars) {
            if (aChar == 'R') {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                count++;
            }
        }
        return count;
    }
}
