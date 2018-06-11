package DynamicProgramming;

/**
 * @ClassName p122
 * @Description TODO
 * @Author MING
 * @Date 2018/6/11 19:24
 * @Update 2018/6/11 19:24
 **/
public class p122 {
    public int maxProfit(int[] prices) {
        if (prices.length<=1)return 0;
        int profit=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            int r=prices[i]-min;
            if(r>0){
                profit+=r;
                min=prices[i];
            }else{
                if(prices[i]<min)min=prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] argv){
        p122 temp=new p122();
        System.out.println(temp.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
