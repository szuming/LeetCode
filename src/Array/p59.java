package Array;

import java.util.Arrays;

/**
 * 59. 螺旋矩阵 II
 * 题目描述提示帮助提交记录社区讨论阅读解答
 *
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 *
 * 示例:
 *
 * 输入: 3
 * 输出:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 */
public class p59{
    public int[][] generateMatrix(int n) {
        int [][]result=new int[n][n];
        int i=0,j=0,k=0,count=0;
        while(i!=n*n){
            for(j=count,k=count;k<n-count;k++){
                result[j][k]=++i;
            }
            for(j++,k--;j<n-count;j++){
                result[j][k]=++i;
            }
            for(k--,j--;k>=count;k--){
                result[j][k]=++i;
            }
            for(k++,j--;j>count;j--){
                result[j][k]=++i;
            }
            count++;
        }
        return result;
    }

    public static void main(String[] argv){
        p59 temp=new p59();
        System.out.println(Arrays.deepToString(temp.generateMatrix(4)));
    }
}
