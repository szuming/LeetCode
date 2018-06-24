package Array;

/**
 * @ClassName p33
 * @Description TODO
 * @Author MING
 * @Date 2018/6/24 17:15
 * @Update 2018/6/24 17:15
 **/
public class p33{
    public int search(int[] nums, int target) {
        int len=nums.length,i=0,j=len-1;
        if(len==0)return -1;
        if(nums[i]==target)return i;
        if(nums[j]==target)return j;
        if(nums[i]>target){
            while(i<j){
                if(nums[j]==target)return j;
                else j--;
            }
        }else if(nums[i]<target) {
            while(i<j){
                if(nums[i]==target)return i;
                else {
                    i++;
                }
            }
        }else return i;
        return -1;
    }

    public static void main(String[] argv){
        p33 temp=new p33();
        System.out.println(temp.search(new int[]{4,5,6,7,0,1,2},0));
    }
}
