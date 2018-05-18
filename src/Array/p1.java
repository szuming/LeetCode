package Array;


import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

 示例:

 给定 nums = [2, 7, 11, 15], target = 9

 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]


 */
public class p1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>(nums.length);
        int i,diff;
        int result[]=new int[2];
        for(i=0;i<nums.length;i++){
            diff=target-nums[i];
            map.put(diff,i);
        }
        for(i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])&&map.get(nums[i])!=i){
                result[0]=i;
                result[1]=map.get(nums[i]);
                return result;
            }
        }
        return result;
    }

    public static void main(String argv[]){
        p1 temp=new p1();
        int res[]=temp.twoSum(new int[]{2,11,11,7},9);
    }
}
