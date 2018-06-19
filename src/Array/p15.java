package Array;

import java.util.*;


/**
 * @ClassName p15
 * @Description TODO
 * @Author MING
 * @Date 2018/6/19 16:34
 * @Update 2018/6/19 16:34
 **/
public class p15{
    /*public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int len=nums.length;
        if(len<3)return result;
        Set<Set<Integer>> set=new HashSet<>();
        int i,j,k;
        for(i=0;i<len;i++){
            for(j=i+1;j<len;j++){
                for(k=j+1;k<len;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        Set<Integer> temp=new HashSet<>(3);
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        if(set.contains(temp))continue;
                        set.add(temp);
                        List<Integer> list=new ArrayList<>(3);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        result.add(list);
                    }
                }
            }
        }
        return result;
    }*/

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int len=nums.length;
        if(len<3)return result;
        Arrays.sort(nums);
        for(int i=0;i<len-2;i++){
            if(i>=1&&nums[i]==nums[i-1])continue;
            for(int j=i+1,k=len-1;j<k;){
                int count=nums[i]+nums[j]+nums[k];
                if(count==0){
                    List<Integer> list=new ArrayList<>(3);
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    while(j+1<k&&nums[j]==nums[j+1])j++;
                    while(k-1>j&&nums[k]==nums[k-1])k--;
                    j++;
                    k--;
                }else if(count<0){
                    j++;
                }else k--;
            }
        }
        return result;
    }

    public static void main(String[] argv){
        p15 temp=new p15();
        List result=temp.threeSum(new int[]{-5,-4,-2,-1,0,1,2,3,6});
    }

}
