package offer;

/**
 * 表示数值的字符串
 * <p>
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class P52 {
    public boolean isNumeric (char[] str){
        int index = 0,es=0;
        boolean flag = true;
        if (str[0] == '-'||str[0]=='+') {
            index++;
        }
        while (index < str.length) {
            if (str[index] == '.') {
                if (!flag) return false;
                flag=false;
                index++;
            }else if (str[index] == 'e' || str[index] == 'E') {
                if (es == 1)return false;
                es++;
                flag=false;
                if (index - 1 < 0 || ! checkNum(str[index - 1])) {
                    return false;
                }
                if (index + 1 >= str.length) {
                    return false;
                }
                if (! checkNum(str[index + 1])){
                    if (str[index+1]!='-'&&str[index+1]!='+'){
                        return false;
                    }else {
                        if (index + 2 >= str.length||!checkNum(str[index + 2]))return false;
                    }
                    index++;
                }
                index++;
            }else if (checkNum(str[index])) {
                index++;
            }else {
                return false;
            }
        }
        return true;
    }

    private boolean checkNum (char ch){
        if (ch <= '9' && ch >= '0') return true;
        return false;
    }

    public static void main (String[] args){
        P52 temp = new P52();
        System.out.println(temp.isNumeric(new char[] {'1','2','.','4','e','+','6'}));
    }

}
