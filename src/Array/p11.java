package Array;

import sun.nio.cs.ext.MacHebrew;

/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。画 n 条垂直线，使得垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 注意：你不能倾斜容器，n 至少是2。
 * 输出容积
 */
public class p11 {
    /*public int maxArea(int[] height) {
        int i,j,max=0,temp,len=height.length;
        if(len<=1)return 0;
        for(i=0;i<len;i++){
            for(j=i+1;j<len;j++){
                max=Math.max(max,(j-i)*Math.min(height[i],height[j]));
            }
        }
        return max;
    }*/

    public int maxArea(int[] height) {
        int i,j,len=height.length,max=0;
        if(len<=1)return 0;
        for(i=0,j=len-1;i!=j;){
            max=Math.max(max,Math.min(height[i],height[j])*(j-i));
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }


    public static void main(String[] argv){
        p11 temp=new p11();
        System.out.println(temp.maxArea(new int[]{1,5,8,6,9}));
    }

}
