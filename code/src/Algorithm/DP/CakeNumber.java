package Algorithm.DP;

import DataStructure.Array.ArrayDemo;
import Visualization.DPVisual;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class CakeNumber {
    static DPVisual dpVisual=new DPVisual();
    public static int cakeNumber(int n) {
        // write code here
        int[] dp = new int[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i > 0; i--) {
            dp[i] = 3 * (dp[i + 1] + 1) / 2;
            dpVisual.drawDp1(ArrayDemo.toIntegerArray1(dp));
        }
        return dp[1];
    }

}
