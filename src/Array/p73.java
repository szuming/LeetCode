package Array;

/**
 * 73. 矩阵置零
 * 题目描述提示帮助提交记录社区讨论阅读解答
 *
 * 给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。
 *
 * 示例 1:
 *
 * 输入:
 * [
 *   [1,1,1],
 *   [1,0,1],
 *   [1,1,1]
 * ]
 * 输出:
 * [
 *   [1,0,1],
 *   [0,0,0],
 *   [1,0,1]
 * ]
 *
 * 示例 2:
 *
 * 输入:
 * [
 *   [0,1,2,0],
 *   [3,4,5,2],
 *   [1,3,1,5]
 * ]
 * 输出:
 * [
 *   [0,0,0,0],
 *   [0,4,5,0],
 *   [0,3,1,0]
 * ]
 *
 * 进阶:
 *
 *     一个直接的解决方案是使用  O(mn) 的额外空间，但这并不是一个好的解决方案。
 *     一个简单的改进方案是使用 O(m + n) 的额外空间，但这仍然不是最好的解决方案。
 *     你能想出一个常数空间的解决方案吗？
 */
public class p73{
    /*public void setZeroes(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length,i,j;
        int[] ns=new int[n];
        int[] ms=new int[m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(matrix[i][j]==0){
                    ns[i]=1;
                    ms[j]=1;
                }
            }
        }
        for(i=0;i<n;i++){
            if(ns[i]==1){
                for(j=0;j<m;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(j=0;j<m;j++){
            if(ns[j]==1){
                for(i=0;i<n;i++){
                    matrix[i][j]=0;
                }
            }
        }
    }*/

    class Solution {
        public void setZeroes(int[][] matrix) {
            int n=matrix.length,m=matrix[0].length,i,j;
            if(n==0||m==0)return;
            boolean flag1=false,flag2=false;
            //1.flag1,flag2标记第一行与第一列是否重置
            for(i=0;i<m;i++){
                if(matrix[0][i]==0){
                    flag2=true;
                    break;
                }
            }
            for(j=0;j<n;j++){
                if(matrix[j][0]==0){
                    flag1=true;
                    break;
                }
            }
            //2.从第二行第二列开始，只要有0就将对应的第一行第一列位置置为0
            for(i=1;i<n;i++){
                for(j=1;j<m;j++){
                    if(matrix[i][j]==0){
                        matrix[i][0]=0;
                        matrix[0][j]=0;
                    }
                }
            }
            //3.从第2步得到的结果，再次遍历第一行与第一列，将为0的全部置为0
            for(i=1;i<n;i++){
                if(matrix[i][0]==0){
                    for(j=1;j<m;j++){
                        matrix[i][j]=0;
                    }
                }
            }
            for(j=1;j<m;j++){
                if(matrix[0][j]==0){
                    for(i=1;i<n;i++){
                        matrix[i][j]=0;
                    }
                }
            }
            //4.最后再将第一行第一列重置为0
            if(flag2){
                for(j=0;j<m;j++)matrix[0][j]=0;
            }
            if(flag1){
                for(i=0;i<n;i++)matrix[i][0]=0;
            }
        }
    }
}
