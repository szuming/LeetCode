package offer;

/**
 * @ClassName P63
 * @Description
 * @Author MING
 * @Date 2018/9/26 8:34
 * @Update 2018/9/26 8:34
 **/
public class P63 {
    private final static String[] unit = {"","十","百","千","万","十万","百万","千万","亿"};
    private final static String[] single = {"零","一","二","三","四","五","六","七","八","九"};

    // 总函数，判断正负，然后分别求整数部分与小数部分，将结果合并
    private String Double2Chinese(double m){
        StringBuilder result = new StringBuilder();
        if (m<0)result.append("负");
        String s = String.valueOf(m);
        if (s.contains(".")){
            String[] strings = s.split("\\.");
            result.append(Int2Chinese(Integer.parseInt(strings[0])))
                    .append("点")
                    .append(Decimal2Chinese(Integer.parseInt(strings[1])));
        }else {
            result.append(Int2Chinese(Integer.parseInt(String.valueOf(m))));
        }
        return result.toString();
    }

    // 整数部分，通过位数对应数组的单位
    private String Int2Chinese(int m){
        StringBuilder result = new StringBuilder();
        char[] chars = String.valueOf(m).toCharArray();
        int length = chars.length,i;
        boolean flag = false;
        for (i = 0; i<length;i++){
            String temp = String.valueOf(chars[i]);
            boolean isZero = chars[i] == '0';
            if (!isZero) {
                if (flag){
                    result.append("零");
                    flag=false;
                }
                result.append(single[Integer.valueOf(temp)]);
                result.append(unit[length-i-1]);
            }else {
                flag=true;
            }
        }
        return result.toString();
    }

    //小数部分，通过值对应个位
    private String Decimal2Chinese(int m){
        char[] chars = String.valueOf(m).toCharArray();
        int i,length = chars.length;
        StringBuilder result = new StringBuilder();

        for (i = 0;i<length;i++){
            String temp = String.valueOf(chars[i]);
            result.append(single[Integer.valueOf(temp)]);
        }
        return result.toString();
    }

    public static void main (String[] args){
        P63 temp = new P63();
        System.out.println(temp.Double2Chinese(101.12));
    }
}
