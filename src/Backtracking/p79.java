package Backtracking;

/**
 * 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
 *
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *
 * 示例:
 *
 * board =
 * [
 *   ['A','B','C','E'],
 *   ['S','F','C','S'],
 *   ['A','D','E','E']
 * ]
 *
 * 给定 word = "ABCCED", 返回 true.
 * 给定 word = "SEE", 返回 true.
 * 给定 word = "ABCB", 返回 false.
 */
public class p79{
    public boolean exist(char[][] board, String word) {
        if(board.length==0||board[0].length==0||word.length()==0)return false;
        char[] cp=word.toCharArray();
        int[][] flag=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(backTracking(board,cp,flag,0,i,j)==1)return true;
            }
        }
        return false;
    }

    public int backTracking(char[][] board, char[] cp,int[][] flag,int count,int i,int j){
        if(board[i][j]==cp[count]){     //符合则继续
            count++;
            flag[i][j]=1;
            if(count==cp.length)return 1;
            int a1=0,a2=0,a3=0,a4=0;    //存储四个方向搜索的结果
            if(j-1>=0&&flag[i][j-1]==0){           //向左搜索
                a1=backTracking(board,cp,flag,count,i,j-1);    //从3方向来所以d为3
            }
            if(i-1>=0&&flag[i-1][j]==0){           //向上搜索
                a2=backTracking(board,cp,flag,count,i-1,j);
            }
            if(j+1<board[0].length&&flag[i][j+1]==0){  //向右
                a3=backTracking(board,cp,flag,count,i,j+1);
            }
            if(i+1<board.length&&flag[i+1][j]==0){     //向下
                a4=backTracking(board,cp,flag,count,i+1,j);
            }
            if(a1==1|a2==1|a3==1|a4==1){
                return 1;
            }
        }
        flag[i][j]=0;
        return 0;
    }

    public static void main(String[] argv){
        p79 temp=new p79();
        System.out.println(temp.exist(new char[][]{{'a'},{'a'}},"aaa"));
    }
}
