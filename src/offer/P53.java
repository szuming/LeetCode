package offer;

/**
 * 字符流中第一个不重复的字符
 */
public class P53 {
    int index=1;
    int[] map = new int[100000];
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if (map[ch]!=0){
            map[ch]=-1;
        }else {
            map[ch]=index++;
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        int minIndex = Integer.MAX_VALUE;
        char result = '#';
        for (int i = 0;i < map.length;i++) {
            if (map[i]>0){
                if (map[i]<minIndex){
                    minIndex = map[i];
                    result = (char)i;
                }
            }
        }
        return result;
    }
}
