package string;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

 说明：本题中，我们将空字符串定义为有效的回文串。

 示例 1:

 输入: "A man, a plan, a canal: Panama"
 输出: true

 示例 2:

 输入: "race a car"
 输出: false


 */
public class p125 {
    public boolean isPalindrome(String s) {
        char cp[]=s.toCharArray();
        boolean flag=true;
        if(s.length()==0)return true;
        int i,j;
        for(i=0,j=cp.length-1;i<j;i++){
            while((cp[i]<'0'||cp[i]>'9')&&(cp[i]<'a'||cp[i]>'z')&&(cp[i]<'A'||cp[i]>'Z')&&i<j){         //找到左边的合格字符
                i++;
            }
            while((cp[j]<'0'||cp[j]>'9')&&(cp[j]<'a'||cp[j]>'z')&&(cp[j]<'A'||cp[j]>'Z')&&i<j){         //找到右边的合格字符
                j--;
            }
            if(i<j&&Character.toLowerCase(cp[i])!=Character.toLowerCase(cp[j])){                        //比较大小
                flag=false;
                break;
            }else{
                j--;
            }
        }
        return flag;
    }

    public static void main(String argv[]){
        p125 temp=new p125();
        System.out.println(temp.isPalindrome(",.1"));
    }
}
