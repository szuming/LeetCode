package DynamicProgramming;

/**
 * 给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你最多可以完成 两笔 交易。
 *
 * 注意: 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 * 示例 1:
 *
 * 输入: [3,3,5,0,0,3,1,4]
 * 输出: 6
 * 解释: 在第 4 天（股票价格 = 0）的时候买入，在第 6 天（股票价格 = 3）的时候卖出，这笔交易所能获得利润 = 3-0 = 3 。
 *      随后，在第 7 天（股票价格 = 1）的时候买入，在第 8 天 （股票价格 = 4）的时候卖出，这笔交易所能获得利润 = 4-1 = 3 。
 *
 * 示例 2:
 *
 * 输入: [1,2,3,4,5]
 * 输出: 4
 * 解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *      注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。
 *      因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
 *
 * 示例 3:
 *
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这个情况下, 没有交易完成, 所以最大利润为 0。
 */
public class p123 {
    public int maxProfit(int[] prices) {
        if(prices.length<=1)return 0;
        int len=prices.length;
        int max=0;
        int firstTime=prices[0];                    //第一次最低价
        int firstProfit=0;                          //第一次的利润
        int secondTime;                             //第二次最低价
        int secondProfit=0;                         //第二次的利润

        int[] count=new int[len];

        for(int i=0;i<len;i++){
            if(prices[i]>firstTime)continue;        //下一个可能的买入点
            else{                                   //寻找卖出点
                firstTime=prices[i];                //更新第一次最低价
                firstProfit=0;
                for(int j=i+1;j<len;j++){
                    int r=prices[j]-firstTime;
                    if(r>0){                        //有利润就卖出第一次股票
                        firstProfit=r;
                        if(count[j]>0){             //卖出点作为第二次的买入点的利润已经计算过且大于0
                            secondProfit=count[j];
                        }else if(count[j]<0){       //小于0则第二次利润为0
                            secondProfit=0;
                        }else{                      //没计算过则执行计算
                            secondTime=prices[j];
                            secondProfit=0;
                            for(int k=j+1;k<len;k++){
                                int r1=prices[k]-secondTime;
                                if(r1>secondProfit){
                                    secondProfit=r1;
                                }
                                if(prices[k]<secondTime)secondTime=prices[k];
                            }
                            if(secondProfit>0)count[j]=secondProfit;  //记录第j点购入所能得到的最大利润，下次直接取
                            else{
                                count[j]=-1;
                            }
                        }
                        if(max<firstProfit+secondProfit)max=firstProfit+secondProfit;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] argv){
        p123 temp=new p123();
        System.out.println(temp.maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }
}
