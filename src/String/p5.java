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




/**
 *

 class Solution {
 public String longestPalindrome(String s) {
 int start = 0, end = 0;
 for (int i = 0; i < s.length(); i++) {
 int len1 = expandAroundCenter(s, i, i);
 int len2 = expandAroundCenter(s, i, i + 1);
 int len = Math.max(len1, len2);
 if (len > end - start) {
 start = i - (len - 1) / 2;
 end = i + len / 2;
 }
 }
 return s.substring(start, end + 1);
 }

 private int expandAroundCenter(String s, int left, int right) {
 int L = left, R = right;
 while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
 L--;
 R++;
 }
 return R - L - 1;
 }
 }


 */
