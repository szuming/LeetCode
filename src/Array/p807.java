package Array;

public class p807 {
    /**
     * Example:
     Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
     Output: 35
     Explanation:
     The grid is:
     [ [3, 0, 8, 4],
     [2, 4, 5, 7],
     [9, 2, 6, 3],
     [0, 3, 1, 0] ]

     The skyline viewed from top or bottom is: [9, 4, 8, 7]
     The skyline viewed from left or right is: [8, 7, 9, 3]

     The grid after increasing the height of buildings without affecting skylines is:

     gridNew = [ [8, 4, 8, 7],
     [7, 4, 7, 7],
     [9, 4, 8, 7],
     [3, 3, 3, 3] ]
     */
    public static  void main(String argv[]){
        int grid[][]={{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        p807 temp=new p807();
        System.out.println(temp.maxIncreaseKeepingSkyline(grid));
    }

    public  int maxIncreaseKeepingSkyline(int[][] grid) {
        int i,j,sum=0;
        int max1[]=new int[grid.length];
        int max2[]=new int[grid[0].length];
        for(i=0;i<grid[0].length;i++){
            for(j=0;j<grid[0].length;j++){
                if(grid[i][j]>max1[i])max1[i]=grid[i][j];
                if(grid[j][i]>max2[i])max2[i]=grid[j][i];
            }
        }
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[0].length;j++){
                if(max1[i]<max2[j])sum+=max1[i]-grid[i][j];
                else{
                    sum+=max2[j]-grid[i][j];
                }
            }
        }
        return sum;
    }


}
