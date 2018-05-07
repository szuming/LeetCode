package DynamicProgramming;

/**
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。

 说明：每次只能向下或者向右移动一步。

 示例:

 输入:
 [
 [1,3,1],
 [1,5,1],
 [4,2,1]
 ]
 输出: 7
 解释: 因为路径 1→3→1→1→1 的总和最小。


 */
public class p64 {
    //要找到当前点到终点的最短距离，只需找到右边一点到终点的距离min1，与下边一点到终点的距离min2，取两者较小值并+自身值
    public int minPathSum(int[][] grid) {
        int MinSumSave[][]=new int[grid.length+1][grid[0].length+1];            //用于储存之前遍历的结果，比grid长宽大1是因为临界问题
        return MinSum(grid,0,0,MinSumSave);
    }

    //动态规划求解
    private int MinSum(int [][]grid,int i,int j,int MinSumSave[][]){
        if(i>=grid.length)return 9999;             //如果超过范围则返回最大值
        if(j>=grid[0].length)return 9999;
        if(i==grid.length-1&&j==grid[0].length-1)return grid[i][j];     //到了终点，返回终点值
        int min1,min2;
        if(MinSumSave[i+1][j]!=0){          //如果之前有算过就取之前的运算结果
            min1=MinSumSave[i+1][j];
        }else{
            min1=MinSum(grid,i+1,j,MinSumSave);
            MinSumSave[i+1][j]=min1;
        }
        if(MinSumSave[i][j+1]!=0){          //如果之前有算过就取之前的运算结果
            min2=MinSumSave[i][j+1];
        }else{
            min2=MinSum(grid,i,j+1,MinSumSave);
            MinSumSave[i][j+1]=min2;
        }
        return Math.min(min1,min2)+grid[i][j];
    }

    public static void main(String argv[]){
        p64 temp=new p64();
        int [][]grid={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(temp.minPathSum(grid));
    }
}
