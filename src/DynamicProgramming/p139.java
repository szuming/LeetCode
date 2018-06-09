package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。

 说明：

 拆分时可以重复使用字典中的单词。
 你可以假设字典中没有重复的单词。

 示例 1：

 输入: s = "leetcode", wordDict = ["leet", "code"]
 输出: true
 解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。

 示例 2：

 输入: s = "applepenapple", wordDict = ["apple", "pen"]
 输出: true
 解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。
 注意你可以重复使用字典中的单词。

 示例 3：

 输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 输出: false
 **/
public class p139 {
    Map<String,Integer> map=new HashMap();
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] flag=new int[s.length()];
        for(String temp:wordDict)map.put(temp,1);
        int index=0;
        return dp(s,"",index,flag);
    }

    public Boolean dp(String s,String cur,int index,int[] flag){
        //到达最后一位
        if(index==s.length())return true;
        for(int i=index;i<s.length();i++){
            cur=cur+s.charAt(i);
            if(map.containsKey(cur)){
                if(flag[i]!=1&&dp(s,"",i+1,flag)){
                    return true;
                }else{
                    flag[i]=1;
                }
            }
        }
        return false;
    }

    public static void main(String[] argv){
        p139 temp=new p139();
        List<String> list=new ArrayList<>();
        list.add("ca");
        list.add("cat");
        list.add("t");
        list.add("sand");
        list.add("dg");
        System.out.println(temp.wordBreak("catsandog",list));
    }
}
