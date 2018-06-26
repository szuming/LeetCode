package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的每个数字在每个组合中只能使用一次。
 *
 * 说明：
 *
 *     所有数字（包括目标数）都是正整数。
 *     解集不能包含重复的组合。
 *
 * 示例 1:
 *
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 所求解集为:
 * [
 *   [1, 7],
 *   [1, 2, 5],
 *   [2, 6],
 *   [1, 1, 6]
 * ]
 *
 * 示例 2:
 *
 * 输入: candidates = [2,5,2,1,2], target = 5,
 * 所求解集为:
 * [
 *   [1,2,2],
 *   [5]
 * ]
 */
public class p40{
    List<List<Integer>> result=new ArrayList<>(20);
    public List<List<Integer>> combinationSum2(int[] candidates,int target){
        if(candidates.length<=0)return result;
        Arrays.sort(candidates);
        backTracking(new ArrayList<>(10),-1,0,candidates,target);
        return result;
    }

    /*public void backTracking(List<Integer> temp,int index,int sum,int[] candidates,int target){
        if(index==-1){
            for(index++;index<candidates.length;index++){
                backTracking(temp,index,sum,candidates,target);
                temp.remove(temp.size()-1);
                while(index+1<candidates.length&&candidates[index+1]==candidates[index])index++;
            }
        }
        if(index>=candidates.length)return;
        sum+=candidates[index];
        temp.add(candidates[index]);
        if(sum==target){
            result.add(new ArrayList<>(temp));
        }else if(sum>target){
        }else{
            for(index++;index<candidates.length;index++){
                backTracking(temp,index,sum,candidates,target);
                temp.remove(temp.size()-1);
                while(index+1<candidates.length&&candidates[index+1]==candidates[index])index++;
            }
        }
    }*/

    public int backTracking(List<Integer> temp,int index,int sum,int[] candidates,int target){
        if(index==-1){
            for(index++;index<candidates.length;index++){
                if(backTracking(temp,index,sum,candidates,target)>target){
                    temp.remove(temp.size()-1);
                    break;
                }
                temp.remove(temp.size()-1);
                while(index+1<candidates.length&&candidates[index+1]==candidates[index])index++;
            }
        }
        if(index>=candidates.length)return 0;
        sum+=candidates[index];
        temp.add(candidates[index]);
        if(sum==target){
            result.add(new ArrayList<>(temp));
        }else if(sum>target){
            return sum;
        }else{
            for(index++;index<candidates.length;index++){
                if(backTracking(temp,index,sum,candidates,target)>target){
                    temp.remove(temp.size()-1);
                    break;
                }
                temp.remove(temp.size()-1);
                while(index+1<candidates.length&&candidates[index+1]==candidates[index])index++;
            }
        }
        return 0;
    }

    public static void main(String[] argv){
        p40 temp=new p40();
        temp.combinationSum2(new int[]{1,2,3},3);
    }
}
