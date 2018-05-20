package String;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。

 示例 1：

 输入: "babad"
 输出: "bab"
 注意: "aba"也是一个有效答案。

 示例 2：

 输入: "cbbd"
 输出: "bb"


 */
public class p5 {
    public String longestPalindrome(String s) {
        int i,j,max=0,maxj=0,maxi=0;
        char[] cp=s.toCharArray();
        String result="";
        for(i=0;i<cp.length;i++){
            for(j=cp.length-1;j>i&&j-i>max;j--){    //如果不能大于max则不可能会是最长回文串
                if(checkPalindrome(i,j,cp)){        //true找到i的最长回文串
                    if(j-i>max){
                        max=j-i;
                        maxj=j;
                        maxi=i;
                    }
                    break;
                }
            }
        }
        return s.substring(maxi,maxj+1);
    }

    public boolean checkPalindrome(int i,int j,char[] cp){
        if(i>=j)return true;
        else {
            if(cp[i]!=cp[j])return false;
            else{
                return checkPalindrome(i+1,j-1,cp);
            }
        }
    }

    public static void main(String[] args){
        p5 temp=new p5();
        System.out.println(temp.longestPalindrome("bab"));
    }


}
