package Array;

import java.security.PublicKey;
import java.util.Arrays;

/**
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 *
 * 示例 2:
 *
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class p66{
    public int[] plusOne(int[] digits) {
        int[] result=new int[digits.length];
        int i,add=0;
        for(i=digits.length-1;i>=0;i--){
            if(i==digits.length-1){
                if(digits[i]==9){
                    add=1;
                    result[i]=0;
                }else{
                    result[i]=digits[i]+1;
                }
            }else{
                if(digits[i]==9&&add==1){
                    result[i]=0;
                }else{
                    result[i]=digits[i]+add;
                    add=0;
                }
            }
        }
        if(add==1&&result[0]==0){
            int []newR=new int[digits.length+1];
            newR[0]=1;
            for(i=0;i<digits.length;i++){
                newR[i+1]=result[i];
            }
            return newR;
        }else{
            return result;
        }
    }

    public static void main(String[] argv){
        p66 temp=new p66();
        System.out.println(Arrays.toString(temp.plusOne(new int[]{2,4,9,3,9})));
    }
}
