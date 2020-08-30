package Algorithm.DP;

import DataStructure.Array.ArrayDemo;
import Visualization.DPVisual;

import java.util.Arrays;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class NumSquares {
    public static int numSquares(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        int max_square=(int)Math.sqrt(n)+1;

        int[] square_num=new int[max_square];
        for(int i=1;i<max_square;i++){
            square_num[i]=i*i;
        }
        DPVisual dpVisual =new DPVisual();
        for(int i=1;i<=n;i++){
            for(int j=1;j<max_square;j++){
                if(i<square_num[j]){
                    break;
                }else{
                    dp[i]=Math.min(dp[i],dp[i-square_num[j]]+1);

                }
                dpVisual.drawDp1(ArrayDemo.toIntegerArray1(dp));
            }
        }
        return dp[n];
    }
}
