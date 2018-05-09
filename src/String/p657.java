package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 初始位置 (0, 0) 处有一个机器人。给出它的一系列动作，判断这个机器人的移动路线是否形成一个圆圈，换言之就是判断它是否会移回到原来的位置。

 移动顺序由一个字符串表示。每一个动作都是由一个字符来表示的。机器人有效的动作有 R（右），L（左），U（上）和 D（下）。输出应为 true 或 false，表示机器人移动路线是否成圈。

 示例 1:

 输入: "UD"
 输出: true

 示例 2:

 输入: "LL"
 输出: false


 */
public class p657 {
    public boolean judgeCircle(String moves) {
        if(moves.length()==1)return false;
        Map<Character,Integer> map=new HashMap<>();
        int i;
        for(i=0;i<moves.length();i++){          //统计各字符出现个数
            char temp=moves.charAt(i);
            if(map.containsKey(temp)){   //当前key存在
                map.put(temp,map.get(temp)+1);
            }else{
                map.put(temp,1);
            }
        }
        //若为null则赋值为0
        Character []dir={'U','D','L','R'};
        for(i=0;i<4;i++)if(!map.containsKey(dir[i]))map.put(dir[i],0);
        //检测
        return map.get('U').equals(map.get('D'))&&map.get('L').equals(map.get('R'));
    }

    public static void main(String argv[]){
        p657 temp=new p657();
        System.out.println(temp.judgeCircle("RLUDD"));
    }
}
