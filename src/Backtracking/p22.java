package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 * 题目描述提示帮助提交记录社区讨论阅读解答
 *
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 *
 * 例如，给出 n = 3，生成结果为：
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 */
public class p22{
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        backTracking(new StringBuilder(),0,0,n,result);
        return result;
    }

    private void backTracking(StringBuilder curStr,int count,int consume,int n,List<String> result){
        //放'('
        if(count<n){
            count++;
            consume++;
            StringBuilder temp=new StringBuilder(curStr);
            temp.append('(');
            backTracking(temp,count,consume,n,result);
            count--;
            consume--;
        }
        //放')'
        if(consume>0){
            consume--;
            StringBuilder temp=new StringBuilder(curStr);
            temp.append(')');
            if(temp.length()==2*n){
                if(consume==0) result.add(temp.toString());
            }else{
                backTracking(temp,count,consume,n,result);
            }
        }
    }

    public static void main(String[] argv){
        p22 temp=new p22();
        temp.generateParenthesis(3);
    }

}
