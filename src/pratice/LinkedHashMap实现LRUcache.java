package pratice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMap实现LRUcache {
    private static int n;
    private static LinkedHashMap<Integer,Integer> map;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            // LinkedHashMap容量必须大于LRU cache容量，不然会发生扩容
            map = new LinkedHashMap<Integer,Integer>(n,2 * n, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry eldest) {
                    return size() > n;
                }
            };
            while(scanner.hasNext()) {
                String next = scanner.next();
                if (next.equals("p")) {
                    int key =scanner.nextInt();
                    int value =scanner.nextInt();
                    put(key,value);
                } else {
                    int key =scanner.nextInt();
                    System.out.println(get(key));
                }
            }
        }
    }

    static int get(int key) {
        Integer a = map.get(key);
        return a == null ? -1 : a;
    }

    static void put(int key, int value) {
        map.put(key, value);
    }
}
