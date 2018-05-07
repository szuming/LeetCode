package Backtracking;

/**
 * n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。

 上图为 8 皇后问题的一种解法。

 给定一个整数 n，返回 n 皇后不同的解决方案的数量。

 示例:

 输入: 4
 输出: 2
 解释: 4 皇后问题存在如下两个不同的解法。
 [
 [".Q..",  // 解法 1
 "...Q",
 "Q...",
 "..Q."],

 ["..Q.",  // 解法 2
 "Q...",
 "...Q",
 ".Q.."]
 ]


 */
public class p52 {
    private int result=0;
    public int totalNQueens(int n) {
        if(n==0||n==2||n==3)return 0;
        if(n==1)return 1;
        int queen[]=new int[n];
        for(int i=0;i<n;i++)queen[i]=-1;        //初始化为-1
        backTracking(0,n,queen);
        return result;
    }

    private void backTracking(int i,int n,int queen[]){
        if(i==n){   //得到一种解
            result++;
            return;
        };
        for(int j=0;j<n;j++){
            queen[i]=j; //放皇后
            if(!checkQueen(i,queen)){   //如果不可放则尝试下一位置
                queen[i]=-1;
                continue;
            }else{
                backTracking(i+1,n,queen);       //求下一行皇后位置
            }
        }
    }

    /**
     *
     * @param i     第i行
     * @param queen
     * @return  可放返回true，不可放返回false
     */
    private boolean checkQueen(int i,int queen[]){
        for(int k=0;k<i;k++){       //只用检查该行与在它之前的行的位置
            if(queen[i]==queen[k]||Math.abs(queen[i]-queen[k])-Math.abs(i-k)==0){   //不在同一斜线
                return false;
            }
        }
        return true;
    }

    public static void main(String argv[]){
        p52 temp=new p52();
        System.out.println(temp.totalNQueens(4));
    }

}
