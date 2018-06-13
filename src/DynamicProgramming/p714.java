package DynamicProgramming;

/**
 * 给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。
 *
 * 你可以无限次地完成交易，但是你每次交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
 *
 * 返回获得利润的最大值。
 *
 * 示例 1:
 *
 * 输入: prices = [1, 3, 2, 8, 4, 9], fee = 2
 * 输出: 8
 * 解释: 能够达到的最大利润:
 * 在此处买入 prices[0] = 1
 * 在此处卖出 prices[3] = 8
 * 在此处买入 prices[4] = 4
 * 在此处卖出 prices[5] = 9
 * 总利润: ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
 *
 * 注意:
 *
 *     0 < prices.length <= 50000.
 *     0 < prices[i] < 50000.
 *     0 <= fee < 50000.
 */
public class p714 {

    public int maxProfit(int[] prices, int fee){
        int len=prices.length;
        if(len<=1)return 0;
        int max=0;
        int minPrice=prices[0];
        int boughtPrice=prices[0];
        for(int i=1;i<len;i++){
            int rm=prices[i]-minPrice-fee;

            int r=prices[i]-boughtPrice-fee;
            if(r>0){
                max+=r;
                minPrice=prices[i];
            }
            if(minPrice>prices[i]){
                minPrice=prices[i];
            }
        }
        return max;
    }


    /*public int db(int[] prices,int fee,int index){
        int max=0;
        for(int i=index;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int profit=prices[j]-prices[i]-fee;
                if(profit>0){
                    if(flag[j+1]!=0){
                        profit+=flag[j+1];
                    }else {
                        int next=db(prices,fee,j+1);
                        profit+=next;
                        flag[j+1]=next;
                    }
                    if(profit>max){
                        max=profit;
                    }
                }
            }
        }
        return max;
    }*/

    public static void main(String[] argv){
        p714 temp=new p714();
        System.out.println(temp.maxProfit(new int[]{5,9,1,5,100,2,100},3));
    }
}
