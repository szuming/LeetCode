package Array;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。

 请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。

 示例 1:

 nums1 = [1, 3]
 nums2 = [2]

 中位数是 2.0

 示例 2:

 nums1 = [1, 2]
 nums2 = [3, 4]

 中位数是 (2 + 3)/2 = 2.5


 */
public class p4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0;
        int cp[]=new int[nums1.length+nums2.length];
        while(true){
            if(i==nums1.length){            //nums1遍历完
                for(;j<nums2.length;j++)cp[i+j]=nums2[j];
                break;
            }
            if(j==nums2.length){            //nums2遍历完
                for(;i<nums1.length;i++)cp[i+j]=nums1[i];
                break;
            }
            if(nums1[i]<nums2[j]){
                cp[i+j]=nums1[i++];
            }else{
                cp[i+j]=nums2[j++];
            }
        }
        if(cp.length%2==0)return (cp[cp.length/2]+cp[cp.length/2-1])/2.0;
        else return cp[cp.length/2];
    }

    public static void main(String[] argv){
        p4 temp=new p4();
        System.out.println(temp.findMedianSortedArrays(new int[]{},new int[]{2,3}));
    }
}
