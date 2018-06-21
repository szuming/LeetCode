package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 *
 * 注意：
 *
 * 答案中不可以包含重复的四元组。
 *
 * 示例：
 *
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 *
 * 满足要求的四元组集合为：
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 */
public class p18{
    public List<List<Integer>> fourSum(int[] nums,int target) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length<4||nums==null)return result;
        int len=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<len-3;i++){
            while(i!=0&&i<len-3&&nums[i]==nums[i-1])i++;
            for(int j=i+1;j<len-2;j++){
                while(j!=i+1&&j<len-2&&nums[j]==nums[j-1])j++;
                for(int k=j+1,r=len-1;k<r;){
                    int sum=nums[i]+nums[j]+nums[k]+nums[r];
                    if(sum==target){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[k]);
                        temp.add(nums[r]);
                        temp.add(nums[j]);
                        result.add(temp);
                        while(k<r&&nums[k]==nums[k+1])k++;
                        while(k<r&&nums[r]==nums[r-1])r--;
                        k++;
                        r--;
                    }else if(sum<target){
                        k++;
                    }else r--;
                }
            }
        }
        return result;
    }

    public static void main(String[] argv){
        p18 temp=new p18();
        temp.fourSum(new int[]{-7,-5,0,7,1,1,-10,-2,7,7,-2,-6,0,-10,-5,7,-8,5},0);
    }
}
