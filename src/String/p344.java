package String;

/**
 * 请编写一个函数，其功能是将输入的字符串反转过来。

 示例：

 输入：s = "hello"
 返回："olleh"


 */
public class p344 {
    public String reverseString(String s) {
        if(s.length()<=1)return s;
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String argv[]){
        p344 temp=new p344();
        System.out.println(temp.reverseString("12345"));
    }
}
