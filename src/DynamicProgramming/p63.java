package DynamicProgramming;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 *
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 *
 * 说明：m 和 n 的值均不超过 100。
 *
 * 示例 1:
 *
 * 输入:
 * [
 *   [0,0,0],
 *   [0,1,0],
 *   [0,0,0]
 * ]
 * 输出: 2
 * 解释:
 * 3x3 网格的正中间有一个障碍物。
 * 从左上角到右下角一共有 2 条不同的路径：
 * 1. 向右 -> 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右 -> 向右
 */
public class p63 {
    int[][] record=new int[1000][1000];
    int[][] obstacleGrid;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1)return 0;
        this.obstacleGrid=obstacleGrid;
        return getPaths(0,0);
    }

    public int getPaths(int i,int j){
        if(i>=obstacleGrid.length)return 0;
        if(j>=obstacleGrid[0].length)return 0;
        if(obstacleGrid[i][j]==1)return 0;                                                           //障碍点返回0
        if(i==obstacleGrid.length-1&&j==obstacleGrid[0].length-1){
            return 1;                                                                                //到达终点返回1
        }
        int rPaths;                                         //向右路径数
        if(record[i][j+1]!=0){
            rPaths=record[i][j+1];
        }else {
            rPaths=getPaths(i,j+1);
            record[i][j+1]=rPaths;
        }
        int dPaths;                                         //向下路径数
        if(record[i+1][j]!=0){
            dPaths=record[i+1][j];
        }else {
            dPaths=getPaths(i+1,j);
            record[i+1][j]=dPaths;
        }
        return rPaths+dPaths;                  //到当前点的路径数加上往左与往右的路径数
    }

    public static void main(String[] argv){
        int[][] obstacleGrid={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        p63 temp=new p63();
        System.out.println(temp.uniquePathsWithObstacles(obstacleGrid));

    }
}
