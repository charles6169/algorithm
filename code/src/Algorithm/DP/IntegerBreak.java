package Algorithm.DP;

import DataStructure.Array.ArrayDemo;
import Visualization.DPVisual;

import java.util.Arrays;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class IntegerBreak {
    public static int integerBreak(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 1);

        DPVisual dpVisual = new DPVisual();
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
            }
            dpVisual.drawDp1(ArrayDemo.toIntegerArray1(dp));
        }
        return dp[n];
    }
}
