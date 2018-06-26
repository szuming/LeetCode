package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 *
 * 示例 1:
 *
 * 输入:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * 输出: [1,2,3,6,9,8,7,4,5]
 *
 * 示例 2:
 *
 * 输入:
 * [
 *   [1, 2, 3, 4],
 *   [5, 6, 7, 8],
 *   [9,10,11,12]
 * ]
 * 输出: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class p54{
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix[0].length,m=matrix.length,i=0,j=0,dir=0,l1=n,l2=m;
        List<Integer> result=new ArrayList<>(n*m);
        while(result.size()!=n*m){
            switch(dir){
                case 0:
                    for(i=j-l1;j<l1;j++){
                        result.add(matrix[i][j]);
                    }
            }
        }
        return result;
    }

    public static void main(String[] argv){
        p54 temp=new p54();
        temp.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}});
    }
}
