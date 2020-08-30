package Algorithm.DP;

import DataStructure.Array.ArrayDemo;
import Visualization.DPVisual;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class JumpFloor {
    static DPVisual dpVisual=new DPVisual();

    public static int JumpFloor(int target) {
        if (target < 2) {
            return target;
        }

        int[] dp = new int[target + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= target; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            dpVisual.drawDp1(ArrayDemo.toIntegerArray1(dp));
        }

        return dp[target];
    }

}
