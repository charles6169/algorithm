package Algorithm.DP;

import DataStructure.Array.ArrayDemo;
import Visualization.DPVisual;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class FindTargetSumWays {
    public static int findTargetSumWays(int[] nums, int S) {
        int[] dp = new int[S + 1];
//        dp[0] = 1;
        DPVisual dpVisual=new DPVisual();
        for (int i = 0; i <= S; i++) {
            for (int num : nums) {
                if (i > num) {
                    dp[i] += dp[i - num];
                }
                dpVisual.drawDp1(ArrayDemo.toIntegerArray1(dp));
            }
        }
        return dp[S];
    }
}
