package Algorithm.DP;

import DataStructure.Array.ArrayDemo;
import Visualization.DPVisual;

import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class MinimumTotal {
    public int minimumTotal1(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        List<Integer> lastRow = triangle.get(n - 1);
        for (int i = 0; i < n; ++i) {
            dp[n - 1][i] = lastRow.get(i);
        }
        DPVisual dpVisual =new DPVisual();
        for (int i = n - 2; i >= 0; --i) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < i + 1; ++j) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + row.get(j);
                dpVisual.drawDp2(ArrayDemo.toIntegerArray2(dp));
            }
        }
        return dp[0][0];
    }
}
