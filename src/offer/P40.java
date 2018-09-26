package offer;

import java.util.ArrayList;

/**
 * 排序数组求和为目标s的所有序列
 *
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 */
public class P40 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int i,left = 1,right = 2,count = left+right;
        while (right<sum){
            if (count==sum) {
               ArrayList<Integer> temp = new ArrayList<>();
               for (i = left;i<=right;i++){
                   temp.add(i);
               }
               result.add(temp);
               right++;
               count= count+right;
            }else if (count<sum){
                right++;
                count= count+right;
            }else {
                count= count-right;
                count= count-left;
                right--;
                left++;
            }
        }
        return result;
    }

    public static void main (String[] args){
        P40 temp = new P40();
        ArrayList<ArrayList<Integer>> arrayLists = temp.FindContinuousSequence(9);
        System.out.println(args);
    }
}
