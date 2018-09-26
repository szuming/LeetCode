package offer;

/**
 * 构建乘积数组
 *
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class P50 {
    public int[] multiply(int[] A) {
        int[] front = new int[A.length];
        int[] behind = new int[A.length];
        int i,temp = 1;
        front[0] = 1;
        for (i = 1; i <A.length;i++) {
            front[i] = front[i-1]*A[i-1];
        }
        behind[A.length-1] = 1;
        for (i = A.length-2; i >=0;i--) {
            behind[i] = behind[i+1] * A[i+1];
        }
        int[] result = new int[A.length];
        for (i = 0; i < A.length;i++) {
            result[i] = front[i] * behind[i];
        }
        return result;
    }

    public static void main (String[] args){
        P50 temp = new P50();
        temp.multiply(new int[]{1,2,3,4,5});
    }
}
