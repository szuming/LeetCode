package offer;

/**
 * 丑数
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class P32 {
    public int GetUglyNumber_Solution (int index){
        if (index<=0)return 0;
        int p2 = 0, p3 = 0, p5 = 0, i;
        int[] nums = new int[index];
        nums[0] = 1;
        i = 1;
        while (i < index) {
            int min = getMin(nums[p2]*2, nums[p3]*3, nums[p5]*5);
            nums[i] = min;
            while (nums[p2]*2 <= min)p2++;
            while (nums[p3]*3 <= min)p3++;
            while (nums[p5]*5 <= min)p5++;
            i++;
        }
        return nums[i - 1];
    }

    private int getMin(int a ,int b, int c) {
        int min = a < b? a :b;
        return min<c?min:c;
    }

    public static void main (String[] args){
        P32 temp = new P32();
        System.out.println(temp.GetUglyNumber_Solution(1500));
    }
}
