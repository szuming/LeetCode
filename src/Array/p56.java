package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出一个区间的集合，请合并所有重叠的区间。
 *
 * 示例 1:
 *
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 *
 * 示例 2:
 *
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 */
public class p56{
    public List<Interval> merge(List<Interval> intervals) {
        int i,j,size=intervals.size();
        int[] flag=new int[size];
        List<Interval> result=new ArrayList<>(size);

        for(i=0;i<size;i++){
            Interval minInterval=new Interval(Integer.MAX_VALUE,-1);
            int min=-1;
            for(j=0;j<size-1;j++){
                if(flag[j]!=0)continue;
                Interval indexTemp=intervals.get(j);
                if(minInterval.start>indexTemp.start){
                    minInterval=indexTemp;
                    min=j;
                }
            }
            flag[min]=1;
            if(i==0){
                result.add(minInterval);
            }else{
                Interval first=result.get(result.size()-1);
                if(first.end>=minInterval.start){
                    int big=Math.max(minInterval.end,first.end);
                    first.end=big;
                }else {
                    result.add(minInterval);
                }
            }
        }
        return result;
    }
}

