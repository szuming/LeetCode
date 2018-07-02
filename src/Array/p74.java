package Array;

/**
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 *
 *     每行中的整数从左到右按升序排列。
 *     每行的第一个整数大于前一行的最后一个整数。
 *
 * 示例 1:
 *
 * 输入:
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 3
 * 输出: true
 *
 * 示例 2:
 *
 * 输入:
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 13
 * 输出: false
 */
public class p74{
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0)return false;
        int n=matrix.length,m=matrix[0].length,i=0,j=n-1,k,mid;
        while(i<j){
            if(i==j-1){
                if(matrix[j][0]<=target)i=j;
                break;
            }
            mid=(i+j)/2;
            if(matrix[mid][0]<=target){
                i=mid;
            }else j=mid;
        }
        j=0;
        k=m-1;
        while(true){
            if(j==k-1||j==k){
                if(matrix[i][j]==target||matrix[i][k]==target)return true;
                break;
            }
            mid=(j+k)/2;
            if(matrix[i][mid]<=target){
                j=mid;
            }else k=mid;
        }
        return false;
    }

    public static void main(String[] argv){
        p74 temp=new p74();
        System.out.println(temp.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}},50));
    }
}
