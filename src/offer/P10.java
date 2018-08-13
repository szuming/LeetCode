package offer;

/**
 * @ClassName P10
 * @Description TODO
 * @Author MING
 * @Date 2018/8/12 22:18
 * @Update 2018/8/12 22:18
 **/
public class P10 {
//    public int NumberOf1(int n) {
//        int flag = 1;
//        int count = 0;
//        while(flag != 0) {
//            if ((n & flag)!= 0) {
//                count++;
//            }
//            flag = flag<<1;
//        }
//        return count;
//    }
    public int NumberOf1(int n) {
        int flag = 1;
        int count = 0;
        while(n != 0) {
            if ((n & flag)!= 0) {
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }
}
