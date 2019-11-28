package string;

/**
 * 将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数：

 P   A   H   N
 A P L S I I G
 Y   I   R

 之后从左往右，逐行读取字符："PAHNAPLSIIGYIR"

 实现一个将字符串进行指定行数变换的函数:

 string convert(string s, int numRows);

 示例 1:

 输入: s = "PAYPALISHIRING", numRows = 3
 输出: "PAHNAPLSIIGYIR"

 示例 2:

 输入: s = "PAYPALISHIRING", numRows = 4
 输出: "PINALSIGYAHRPI"
 解释:

 P     I    N
 A   L S  I G
 Y A   H R
 P     I


 */
public class p6 {
    public String convert(String s, int numRows) {
        if(numRows==1)return s;
        String result="";
        int i=0,j=1,k=0;
        char[][]temp=new char[numRows][s.length()];
        while (i<s.length()){                       //遍历s中所有字符
            if(k%(numRows-1)==0){                   //不需换列
                j--;
                temp[j++][k]=s.charAt(i++);
                while(j<numRows-1){                //放完一列
                    if(i>=s.length())break;         //遍历完成跳出循环
                    temp[j++][k]=s.charAt(i++);
                }
                if(i>=s.length())break;         //遍历完成跳出
                temp[j][k]=s.charAt(i++);
                k++;
            }else{                                  //需要换列
                j--;
                temp[j][k++]=s.charAt(i++);
            }
        }
        for(i=0;i<numRows;i++){
            for (j=0;j<s.length();j++){
                if(temp[i][j]!='\u0000')result=result+temp[i][j];
            }
        }
        return result;
    }

    public static void main(String[] argv){
        p6 temp=new p6();
        System.out.println(temp.convert("ab",3));
    }
}
