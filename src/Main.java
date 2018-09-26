import java.util.*;


public class Main {
    static int left,right,left1,right1;

    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int findMaxCapacity(int[] array, int m) {
        int max = Integer.MIN_VALUE,i;
        for (i = 0;i<array.length;i++) {
            array[i] = array[i] + m;
            int temp = findMax(array);
            if (temp>max){
                left1=left;
                right1 = right;
                max=temp;
            }
            array[i] = array[i] - m;
        }
        for (i = left1+1;i<right;i++) {
            if (array[i]!=0){
                max-=array[i];
            }
        }
        return max;
    }

    static int findMax(int[] arrray) {
        int i = 0, j = arrray.length-1,max = Integer.MIN_VALUE;
        while (i<j){
            int min = Math.min(arrray[i],arrray[j]);
            int s = (j-i)*min;
            if (s>max){
                left = i;
                right = j;
                max=s;
            }
            if (arrray[i]<arrray[j]){
                i++;
            }else {
                j--;
            }
        }
        return max;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _array_size = 0;
        _array_size = Integer.parseInt(in.nextLine().trim());
        int[] _array = new int[_array_size];
        int _array_item;
        for(int _array_i = 0; _array_i < _array_size; _array_i++) {
            _array_item = Integer.parseInt(in.nextLine().trim());
            _array[_array_i] = _array_item;
        }

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());

        res = findMaxCapacity(_array, _m);
        System.out.println(String.valueOf(res));

    }
}
