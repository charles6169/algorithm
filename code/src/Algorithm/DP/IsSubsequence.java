package Algorithm.DP;

import DataStructure.Array.ArrayDemo;
import Visualization.DPVisual;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        int[][] dp = new int[len1 + 1][len2 + 1];
        dp[0][0] = 0;
        for (int i = 1; i < len1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 1; j < len2; j++) {
            dp[0][j] = 0;
        }
        DPVisual dpVisual =new DPVisual();
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (s.charAt(i-1) == t.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                dpVisual.drawDp2(ArrayDemo.toIntegerArray2(dp));
            }
        }
        return s.length() == dp[len1][len2];
    }
}
