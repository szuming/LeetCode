package offer;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 数据流中的中位数
 *
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，
 * 那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 */
public class P62 {
    ArrayList<Integer> list = new ArrayList<>();
    public void Insert(Integer num) {
        list.add(num);
    }

    public Double GetMedian() {
        list.sort(Comparator.comparingInt(a -> a));
        int mid = list.size()/2;
        if (list.size()%2==0){
            return (list.get(mid)+list.get(mid-1))/2.0;
        }else {
            return list.get(mid).doubleValue();
        }
    }
}
