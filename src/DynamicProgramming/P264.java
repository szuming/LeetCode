package DynamicProgramming;

/**
 * 编写一个程序，找出第 n 个丑数。
 *
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 *
 * 示例:
 *
 * 输入: n = 10
 * 输出: 12
 * 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
 * 说明:  
 *
 * 1 是丑数。
 * n 不超过1690。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ugly-number-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P264 {
    public int nthUglyNumber(int n) {
        int[] result = new int[10000];
        result[0] = 1;  //第一个丑数为1
        int i2 = 0, i3 = 0, i5 = 0; // 三个指针指向最新计算出得三个丑数
        for (int i = 1; i < n; i++) {
            // 下一个丑数就是前三个丑数分别*2、3、5之后最小的那个
            result[i] = Math.min(result[i2] * 2, Math.min(result[i3] * 3, result[i5] * 5));
            // 如果是*2得到的下一个丑数，那么指针2就要++
            if (result[i] == result[i2] * 2)i2++;
            if (result[i] == result[i3] * 3)i3++;
            if (result[i] == result[i5] * 5)i5++;
        }
        return result[n - 1];
    }
}
