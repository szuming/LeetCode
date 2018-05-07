/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:

 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].

 */


public class p1 {
    public static int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        boolean flag=true;
        for(int i=0;i<nums.length&&flag;i++){
            for(int j=i+1;j<nums.length&&flag;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    flag=false;
                }
            }
        }
        return result;
    }

    public static void main(String argv[]){
        final int []nums={11,2,15,7};
        final int target=9;
        int result[]=twoSum(nums,target);
        System.out.println(result[0]+"  "+result[1]);
    }
}
