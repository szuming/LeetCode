package DynamicProgramming;


/**
 * 假设你正在爬楼梯。需要 n 步你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 步 + 1 步
 * 2.  2 步
 *
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 步 + 1 步 + 1 步
 * 2.  1 步 + 2 步
 * 3.  2 步 + 1 步
 */
public class p70 {
    public int climbStairs(int n) {
        int ways[]=new int[n+2];        //每一个楼梯到达楼顶的方法数目
        return dp(n,0,ways);
    }

    public int dp(int n,int index,int ways[]){
        if(index>=n-1)return 1;         //到达楼顶
        int count1=0;
        int count2=0;
        if(ways[index+1]!=0){           //上一个楼梯到达楼顶的方法数目已求则直接取
            count1=ways[index+1];
        }else {
            count1=dp(n,index+1,ways);      //未知则求得后更新ways
            ways[index+1]=count1;
        }
        if(ways[index+2]!=0){                       //上二个楼梯到达楼顶的方法数目已求得直接取
            count2=ways[index+2];
        }else {                                     //并未求得则求解后更新ways
            count2=dp(n,index+2,ways);
            ways[index+2]=count2;
        }
        return count1+count2;                       //当前点的方法个数
    }

    public static void main(String[] argv){
        p70 temp=new p70();
        System.out.println(temp.climbStairs(4));
    }
}
