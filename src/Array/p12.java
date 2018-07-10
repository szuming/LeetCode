package Array;

/**
 * 12. 整数转罗马数字
 * 题目描述提示帮助提交记录社区讨论阅读解答
 *
 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 *     I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 *     X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 *     C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 *
 * 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
 *
 * 示例 1:
 *
 * 输入: 3
 * 输出: "III"
 *
 * 示例 2:
 *
 * 输入: 4
 * 输出: "IV"
 *
 * 示例 3:
 *
 * 输入: 9
 * 输出: "IX"
 *
 * 示例 4:
 *
 * 输入: 58
 * 输出: "LVIII"
 * 解释: C = 100, L = 50, XXX = 30, III = 3.
 *
 * 示例 5:
 *
 * 输入: 1994
 * 输出: "MCMXCIV"
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 */
public class p12{
    public String intToRoman(int num) {
        int i,a=10;
        StringBuilder sb=new StringBuilder();
        for(i=0;i<5;i++){
            int b=num%a;
            num=num/a;
            switch(i){
                case 0:
                    if(b==9){
                        sb.insert(0,"IX");
                    }else if(b>=5){
                        b=b-5;
                        while(b>0){
                            sb.insert(0,"I");
                            b--;
                        }
                        sb.insert(0,"V");
                    }else if(b==4){
                        sb.insert(0,"IV");
                    }else {
                        while(b>0){
                            sb.insert(0,"I");
                            b--;
                        }
                    }
                    break;
                case 1:
                    if(b==9){
                        sb.insert(0,"XC");
                    }else if(b>=5){
                        b=b-5;
                        while(b>0){
                            sb.insert(0,"X");
                            b--;
                        }
                        sb.insert(0,"L");
                    }else if(b==4){
                        sb.insert(0,"XL");
                    }else{
                        while(b>0){
                            sb.insert(0,"X");
                            b--;
                        }
                    }
                    break;
                case 2:
                    if(b==9){
                        sb.insert(0,"CM");
                    }else if(b>=5){
                        b=b-5;
                        while(b>0){
                            sb.insert(0,"C");
                            b--;
                        }
                        sb.insert(0,"D");
                    }else if(b==4){
                        sb.insert(0,"CD");
                    }else {
                        while(b>0){
                            sb.insert(0,"C");
                            b--;
                        }
                    }
                    break;
                case 3:
                    while(b>0){
                        sb.insert(0,"M");
                        b--;
                    }
                    break;
            }
            if(num==0)break;
        }
        return sb.toString();
    }

    public static void main(String[] argv){
        p12 temp=new p12();
        System.out.println(temp.intToRoman(1111));
    }
}
