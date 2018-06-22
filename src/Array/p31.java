package Array;

/**
 * 31. 下一个排列
 * 题目描述提示帮助提交记录社区讨论阅读解答
 *
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须原地修改，只允许使用额外常数空间。
 *
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 */
public class p31{
    public void nextPermutation(int[] nums) {
        int i,j,len=nums.length;
        boolean flag=true;
        for(i=len-1;i>0&&flag;i--){
            if(nums[i]>nums[i-1]){
                int temp=nums[i];
                nums[i]=nums[i-1];
                nums[i-1]=temp;
                flag=false;
            }
        }
        if(flag){
            for(i=0,j=len-1;i<j;){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
    }
}
