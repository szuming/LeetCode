package DynamicProgramming;


/**
 * 最初在一个记事本上只有一个字符 'A'。你每次可以对这个记事本进行两种操作：
 *
 *     Copy All (复制全部) : 你可以复制这个记事本中的所有字符(部分的复制是不允许的)。
 *     Paste (粘贴) : 你可以粘贴你上一次复制的字符。
 *
 * 给定一个数字 n 。你需要使用最少的操作次数，在记事本中打印出恰好 n 个 'A'。输出能够打印出 n 个 'A' 的最少操作次数。
 *
 * 示例 1:
 *
 * 输入: 3
 * 输出: 3
 * 解释:
 * 最初, 我们只有一个字符 'A'。
 * 第 1 步, 我们使用 Copy All 操作。
 * 第 2 步, 我们使用 Paste 操作来获得 'AA'。
 * 第 3 步, 我们使用 Paste 操作来获得 'AAA'。
 */
public class p650 {
    public int minSteps(int n) {
        int[] md=new int[2*n];
        return get(n,1,0);
    }

    /**
     *
     * @param n 目标长度
     * @param index 当前位置
     * @param cur   当前复制的长度
     * @return
     */
    public int get(int n,int index,int cur){
        //到达直接返回
        if(index==n)return 0;
        //最开始
        else if(index==1){
            cur=1;
            return 2+get(n,index+cur,cur);
        }
        int remailLen=n-index;
        //可以执行复制
        if(remailLen%index==0){
            cur=index;
            return 2+get(n,index+cur,cur);
        }else{
            return 1+get(n,index+cur,cur);
        }
    }

    public static void main(String[] argv){
        p650 temp=new p650();
        System.out.println(temp.minSteps(7));
    }
}
