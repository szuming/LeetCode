package offer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 题目描述
 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class P18 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result=new ArrayList<>();
        if(matrix.length==0)return result;
        int n=matrix[0].length,m=matrix.length,i=-1,j=0,dir=0,l1=n,l2=m,count;
        if(n==0)return result;
        while(result.size()!=n*m){
            count=1;
            switch(dir){
                case 0:
                    for(i++,j=(n-l1)/2;count<=l1;j++,count++){
                        result.add(matrix[i][j]);
                    }
                    l2--;
                    break;
                case 1:
                    for(i++,j--;count<=l2;i++,count++){
                        result.add(matrix[i][j]);
                    }
                    l1--;
                    break;
                case 2:
                    for(i--,j--;count<=l1;j--,count++){
                        result.add(matrix[i][j]);
                    }
                    l2--;
                    break;
                case 3:
                    for(i--,j++;count<=l2;i--,count++){
                        result.add(matrix[i][j]);
                    }
                    l1--;
                    break;
            }
            if(++dir==4)dir=0;
        }
        return result;
    }
}
