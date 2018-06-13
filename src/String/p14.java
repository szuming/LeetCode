package String;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 */
public class p14 {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        if(strs.length==1)return strs[0];
        int i;
        boolean flag=true;
        for (i=0;;i++){
            if(i>=strs[0].length())break;
            char temp=strs[0].charAt(i);
            for (int j=1;j<strs.length;j++){
                if(i>=strs[j].length()){
                    flag=false;
                    break;
                }
                if(strs[j].charAt(i)!=temp){
                    flag=false;
                    break;
                }
            }
            if (!flag)break;
        }
        return strs[0].substring(0,i);
    }

    public static void main(String[] argv){
        p14 temp=new p14();
        String []strs=new String[3];
        strs[0]="abc";
        strs[1]="ab";
        strs[2]="abd";
        System.out.println(temp.longestCommonPrefix(strs));
    }
}
