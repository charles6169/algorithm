package Algorithm.DP;

import DataStructure.Array.ArrayDemo;
import Visualization.DPVisual;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class FindLength {
    public static int findLength(int[] A, int[] B) {
        if (A.length == 0 || B.length == 0) {
            return 0;
        }
        int len1 = A.length;
        int len2 = B.length;
        int[][] dp = new int[len1][len2];
        dp[0][0] = A[0] == B[0] ? 1 : 0;
        for (int i = 0; i < len1; i++) {
            for (int b : B) {
                if (A[i] == b) {
                    dp[i][0] = 1;
                }
            }
        }

        for (int i = 0; i < len2; i++) {
            for (int a : A) {
                if (B[i] == a) {
                    dp[0][1] = 1;
                }
            }
        }
        DPVisual dpVisual = new DPVisual();
        for (int i = 1; i < len1; i++) {
            for (int j = 1; j < len2; j++) {
                if (A[i] == B[j]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], Math.max(dp[i][j - 1], dp[i - 1][j - 1]));
                }
                dpVisual.drawDp2(ArrayDemo.toIntegerArray2(dp));
            }
        }
        return dp[len1 - 1][len2 - 1];
    }
}
