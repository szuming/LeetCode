package Array;



/**
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。

 示例 1:

 输入: [1,4,3,2]

 输出: 4
 解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).

 提示:

 n 是正整数,范围在 [1, 10000].
 数组中的元素范围在 [-10000, 10000].


 */
/*quickSort
        int sum=0,i,j,min=99999,minIndex=-1,tempIndex,temp;
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length-i;j++){       //一轮选座排序
                if(nums[j]<min){
                    min=nums[j];
                    minIndex=j;
                }
            }
            //一轮过后将最小值放到后面
            tempIndex=nums.length-i-1;
            temp=nums[tempIndex];
            nums[tempIndex]=nums[minIndex];
            nums[minIndex]=temp;
            min=99999;
            //如果i是奇数则求和
            if(i%2!=0){
                sum+=Math.min(nums[tempIndex],nums[tempIndex+1]);
            }
        }
        return sum;*/
public class p561 {
    public int arrayPairSum(int[] nums) {
        quickSort(nums,0,nums.length-1);
        int sum=0,i;
        for(i=0;i<nums.length;i=i+2)
            sum+=Math.min(nums[i],nums[i+1]);
        return sum;

    }

    public void quickSort(int nums[],int left,int right){
        if(left>=right)return;
        int i=left,j=right,temp=nums[right];
        while(i<j){
            while(i<j&&nums[i]<temp)i++;
            if(i<j)nums[j--]=nums[i];
            while(i<j&&nums[j]>temp)j--;
            if(i<j)nums[i++]=nums[j];
        }
        nums[i]=temp;
        quickSort(nums,0,i-1);
        quickSort(nums,i+1,right);
    }


    public static void main(String argv[]){
        p561 temp=new p561() ;
        System.out.println(temp.arrayPairSum(new int[]{7,3,1,0,0,6}));
    }
}
