package offer;

/**
 * 反转单词顺序列
 *
 * 题目描述
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 * 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class P43 {
    public String ReverseSentence(String str) {
        if (str == null)return null;
        int i;
        String[] inputs = new StringBuilder(str).reverse().toString().split(" ");
        if (inputs.length<=0)return str;
        StringBuilder sb = new StringBuilder();
        for (i = 0;i<inputs.length-1;i++) {
            sb.append(new StringBuffer(inputs[i]).reverse()).append(" ");
        }
        sb.append(new StringBuffer(inputs[i]).reverse());
        return sb.toString();
    }

    public static void main (String[] args){
        P43 temp = new P43();
        System.out.println(temp.ReverseSentence(" abc"));
    }
}
