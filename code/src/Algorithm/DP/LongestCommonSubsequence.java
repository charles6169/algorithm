package Algorithm.DP;

import DataStructure.Array.ArrayDemo;
import Visualization.DPVisual;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n+1][m+1];
        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= m; i++) {
            dp[0][i] = 0;
        }
        DPVisual dpVisual =new DPVisual();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                dpVisual.drawDp2(ArrayDemo.toIntegerArray2(dp));
            }
        }
        return dp[n][m];
    }
}
