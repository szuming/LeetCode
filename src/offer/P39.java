package offer;

/**
 * 数组中只出现一次的数字
 *
 * 一个整型数组里除了两个数字之外，
 * 其他的数字都出现了偶数次。
 * 请写程序找出这两个只出现一次的数字
 */
public class P39 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int i,j,p1=0,p2=0;
        int temp= array[0];
        for (i = 1; i < array.length;i++) {
            temp = temp ^ array[i];
        }
        i = 1;
        while ((temp& i)==0){
            i=i<<1;
        }
        int[] a1= new int[array.length],a2 = new int[array.length];
        for (j = 0;j<array.length;j++) {
            if ((array[j]&i)==0){
                a1[p1++] = array[j];
            }else {
                a2[p2++] = array[j];
            }
        }
        temp = a1[0];
        for (j = 1; j <a1.length;j++){
            temp = temp^a1[j];
        }
        num1[0]=temp;
        temp = a2[0];
        for (j = 1; j <a2.length;j++){
            temp = temp^a2[j];
        }
        num2[0]=temp;
    }

    public static void main (String[] args){
        P39 temp = new P39();
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        int[] array = new int[]{2,4,3,6,3,2,5,5};
        temp.FindNumsAppearOnce(array,num1,num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
}
