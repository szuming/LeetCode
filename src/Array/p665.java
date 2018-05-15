package Array;

public class p665 {
    public boolean checkPossibility(int[] nums) {
        int i,j,count=0;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
        return false;
    }

    public static void main(String []argv){
        p665 temp=new p665();
        System.out.println(temp.checkPossibility(new int[]{2,1,3}));
    }
}
