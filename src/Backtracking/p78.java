package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。

 说明：解集不能包含重复的子集。

 示例:

 输入: nums = [1,2,3]
 输出:
 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]


 */
public class p78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        backtrack(nums,0,new ArrayList<Integer>(),result);
        return result;
    }

    //回溯
    private void backtrack(int []nums,int start,List<Integer> list,List<List<Integer>> result){
        //每次进来都将元素链表加入result
        result.add(new ArrayList<>(list));
        for(int i=start;i<nums.length;i++){     //无序性,每个元素往后遍历
            list.add(nums[i]);          //将当前元素加入链表
            backtrack(nums,i+1,list,result);
            list.remove(list.size()-1);     //将最后的元素删除
        }
    }
}


