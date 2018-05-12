package Backtracking;

/**
 *如果一个数列至少有三个元素，并且任意两个相邻元素之差相同，则称该数列为等差数列。

 例如，以下数列为等差数列:

 1, 3, 5, 7, 9
 7, 7, 7, 7
 3, -1, -5, -9

 以下数列不是等差数列。

 1, 1, 2, 5, 7



 数组 A 包含 N 个数，且索引从0开始。数组 A 的一个子数组划分为数组 (P, Q)，P 与 Q 是整数且满足 0<=P<Q<N 。

 如果满足以下条件，则称子数组(P, Q)为等差数组：

 元素 A[P], A[p + 1], ..., A[Q - 1], A[Q] 是等差的。并且 P + 1 < Q 。

 函数要返回数组 A 中所有为等差数组的子数组个数。



 示例:

 A = [1, 2, 3, 4]

 返回: 3, A 中有三个子等差数组: [1, 2, 3], [2, 3, 4] 以及自身 [1, 2, 3, 4]。


 */
public class p413 {
    int result=0;
    public int numberOfArithmeticSlices(int[] A) {
        int diff=0,count=0,index=0;    //差，元素个数，结果个数,索引
        backTracking(A,diff,count,index);
        return result;
    }

    public void backTracking(int[] A,int diff,int count,int index){
        if(index>=A.length)return;    //索引大于len时返回0
        else{
            for(int i=index;i<A.length;i++){
                if(count==0){    //元素个数为0时
                    count++;
                    i++;
                    backTracking(A,diff,count,i);
                    count--;
                    i--;
                }else if(count==1){     //元素个数为1时
                    count++;
                    diff=A[i]-A[i-1];
                    i++;
                    backTracking(A,diff,count,i);
                    return;
                }
                else{       //元素个数大于1时
                    if(A[i]-A[i-1]==diff&&count>=2) {    //找到一个等差数列
                        count++;
                        i++;
                        result++;
                        backTracking(A, diff, count, i);
                        return;
                    }else{
                        return;
                    }
                }
            }
        }
    }

    public static void main(String argv[]){
        p413 temp=new p413();
        System.out.println(temp.numberOfArithmeticSlices(new int[]{1,2,3,5,8,11}));
    }
}

