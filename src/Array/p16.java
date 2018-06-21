package Array;

import java.util.Arrays;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 *
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 */
public class p16{
    public int threeSumClosest(int[] nums, int target) {
        int result=0;
        int min=9999999;
        int len=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<len;i++){
            for(int j=i+1,k=len-1;j<k;){
                int temp=nums[i]+nums[j]+nums[k];
                if(Math.abs(temp-target)<min){
                    min=Math.abs(temp-target);
                    result=temp;
                }
                if(temp>target)k--;
                else j++;
            }
        }
        return result;
    }

    public static void main(String[] argv){
        p16 temp=new p16();
        System.out.println(temp.threeSumClosest(new int[]{-5,-4,-2,-1,0,1,2,3,6},3));
    }
}
