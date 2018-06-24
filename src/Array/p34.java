package Array;

import java.util.Arrays;

/**
 * @ClassName p34
 * @Description TODO
 * @Author MING
 * @Date 2018/6/24 17:45
 * @Update 2018/6/24 17:45
 **/
public class p34{
    public int[] searchRange(int[] nums, int target) {
        int i,j,len=nums.length;
        int[] result=new int[]{-1,-1};
        if(len>=1){
            for(i=0,j=len-1;i<=j;){
                if(nums[i]!=target)i++;
                else {
                    result[0]=i;
                }
                if(nums[j]!=target)j--;
                else{
                    result[1]=j;
                }
                if(result[0]!=-1&&result[1]!=-1)return result;
            }
        }
        return result;
    }

    public static void main(String[] argv){
        p34 temp=new p34();
        System.out.println(Arrays.toString(temp.searchRange(new int[]{1},1)));
    }
}
