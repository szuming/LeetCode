package pratice.pdd;

import java.util.Scanner;

/**
 * @ClassName Main
 * @Description
 * @Author MING
 * @Date 2018/8/29 22:48
 * @Update 2018/8/29 22:48
 **/
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int i, min = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[3];
        b[0] = a[0];
        b[1] = a[1];
        b[2] = a[2];
        findMin(b);
        for (i = 3; i < n; i++) {
            if (a[i] > b[0]) {
                b[0] = a[i];
                findMin(b);
            }
        }
        System.out.println(b[0] * b[1] * b[2]);
    }

    private static void findMin(int[] b) {
        int temp;
        if (b[0] > b[1]) {
            temp = b[0];
            b[0] = b[1];
            b[1] = temp;
        }
        if (b[0] > b[2]) {
            temp = b[0];
            b[0] = b[2];
            b[2] = temp;
        }
    }
}
