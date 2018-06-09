package String;

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 示例 1：
 * 给定 s = "hello", 返回 "holle".
 *
 * 示例 2：
 * 给定 s = "leetcode", 返回 "leotcede".
 *
 * 注意:
 * 元音字母不包括 "y".
 */
public class p345 {
    public String reverseVowels(String s) {
        int[] map=new int[1000];
        map['a']=1;
        map['A']=1;
        map['I']=1;
        map['i']=1;
        map['O']=1;
        map['o']=1;
        map['U']=1;
        map['u']=1;
        map['e']=1;
        map['E']=1;
        char[] cp=s.toCharArray();
        for(int i=0,j=s.length()-1;i<j;){
            while(i<j){
                if(map[cp[i]]==1)break;
                i++;
            }
            while(i<j){
                if(map[cp[j]]==1)break;
                j--;
            }
            if(i<j){
                char temp=cp[i];
                cp[i++]=cp[j];
                cp[j--]=temp;
            }
        }
        return new String(cp);
    }

    public static void main(String[] argv){
        p345 temp=new p345();
        System.out.println(temp.reverseVowels("aeiou"));
    }
}
