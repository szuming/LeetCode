package Array;

import java.util.Arrays;

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
        int i,len=nums.length,temp;
        if(len<=1)return;
        for(i=len-2;i>=0;i--){
            int j=i;
            while(j<len-1&&nums[j]>=nums[j+1]){
                int t=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=t;
                j++;
            }
            if(j!=len-1){
                while(j>=i){
                    int t=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=t;
                    j--;
                }
                break;
            }
        }
    }

    public static void main(String[] argv){
        p31 temp=new p31();
        int s[]={1,5,1};
        temp.nextPermutation(s);
        System.out.println(Arrays.toString(s));
    }
}
