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
        List<Integer> result=new ArrayList<>();
        if(matrix.length==0)return result;
        int n=matrix[0].length,m=matrix.length,i=-1,j=0,dir=0,l1=n,l2=m,count;
        if(n==0)return result;
        while(result.size()!=n*m){
            count=1;
            switch(dir){
                case 0:
                    for(i++,j=(n-l1)/2;count<=l1;j++,count++){
                        result.add(matrix[i][j]);
                    }
                    l2--;
                    break;
                case 1:
                    for(i++,j--;count<=l2;i++,count++){
                        result.add(matrix[i][j]);
                    }
                    l1--;
                    break;
                case 2:
                    for(i--,j--;count<=l1;j--,count++){
                        result.add(matrix[i][j]);
                    }
                    l2--;
                    break;
                case 3:
                    for(i--,j++;count<=l2;i--,count++){
                        result.add(matrix[i][j]);
                    }
                    l1--;
                    break;
            }
            if(++dir==4)dir=0;
        }
        return result;
    }

    public static void main(String[] argv){
        p54 temp=new p54();
        temp.spiralOrder(new int[][]{{}});
    }
}
