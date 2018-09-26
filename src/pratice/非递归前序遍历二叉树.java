package pratice;
import java.util.*;

/**
 * 非递归遍历二叉树
 */
public class 非递归前序遍历二叉树 {
    public static void order(String[] a) {
        if (a.length == 1) {
            if (!a[0].equals("#")) System.out.println(a[0]);
            return;
        } else if (a.length == 0) {
            return;
        }
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        while (!list.isEmpty()) {
            int temp = list.getFirst();
            System.out.print(a[temp]);
            int left = 2 * temp + 1;
            while (left < a.length && !a[left].equals("#")) {
                System.out.print(a[left]);
                list.push(left);
                left = 2 * left + 1;
            }
            temp = list.pop();
            int right = 2 * temp + 2;
            while (right >= a.length || a[right].equals("#")) {
                if (list.isEmpty()){
                    break;
                }
                temp = list.pop();
                right = 2 * temp + 2;
            }
            if (right < a.length&&!a[right].equals("#"))list.push(right);
        }
        System.out.println();
    }

    private static String[] parseSampleInput() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            return scanner.nextLine().split(" ");
        }
        return null;
    }

    public static void main(String[] args){
        String[] a = parseSampleInput();
        order(a);
    }
}

