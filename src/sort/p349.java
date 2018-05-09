package sort;

/**
 * 给定两个数组，写一个函数来计算它们的交集。

 例子:

 给定 num1= [1, 2, 2, 1], nums2 = [2, 2], 返回 [2].

 提示:

 每个在结果中的元素必定是唯一的。
 我们可以不考虑输出结果的顺序。


 */
public class p349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int count=0,i,j;
        int temp[]=new int[10000];
        boolean flag[]=new boolean[10000];
        for(i=0;i<nums1.length;i++){
            for(j=0;j<nums2.length;j++) {
                if(nums1[i]==nums2[j]&&!flag[nums1[i]]){
                    temp[count++]=nums1[i];
                    flag[nums1[i]]=true;
                }
            }
        }
        int result[]=new int[count];
        System.arraycopy(temp,0,result,0,count);
        return result;
    }

    public static void main(String argv[]){
        p349 temp=new p349();
        int nums1[]={3,1,2},nums2[]={1,2,3,4};
        temp.intersection(nums1,nums2);
    }
}
