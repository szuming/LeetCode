package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。

 candidates 中的数字可以无限制重复被选取。

 说明：

 所有数字（包括 target）都是正整数。
 解集不能包含重复的组合。

 示例 1:

 输入: candidates = [2,3,6,7], target = 7,
 所求解集为:
 [
 [7],
 [2,2,3]
 ]

 示例 2:

 输入: candidates = [2,3,5], target = 8,
 所求解集为:
 [
 [2,2,2,2],
 [2,3,3],
 [3,5]
 ]
 */
public class p39 {
    /**
     * 使用回溯法求解，当sum>target时剪枝，对于每个元素遍历自身与整个数组
     */
    List<List<Integer>> results=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> result=new ArrayList<>();
        int sum=0;
        backTracking(candidates,result,sum,target,0);
        return results;
    }


    int backTracking(int[] candidates,List<Integer> result,int sum,int target,int index){
        if(sum==target){            //当找到一个解时，加入结果，并使index+1
            results.add(new ArrayList<>(result));
            return index+1;
        }
        else if(sum>target){        //当sum>target时，说明不是解可剪枝，则index+1
            return index+1;
        }
        else{
            int i=index;
            while(i<candidates.length){         //遍历自身与整个数组，则可遍历全部解空间
                sum+=candidates[i];
                result.add(candidates[i]);
                i=backTracking(candidates,result,sum,target,i);
                sum=sum-result.remove(result.size()-1);     //sum要减去之前加上的值，list也要去掉之前加上的值
            }
        }
        return index+1;
    }

    public static void main(String argv[]){
        p39 temp=new p39();
        int []candidates={2,3,5};
        int target=8;
        System.out.println(temp.combinationSum(candidates,target));
    }
}
