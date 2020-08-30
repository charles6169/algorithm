package Algorithm.DP;

import DataStructure.Array.ArrayDemo;
import Visualization.DPVisual;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：62. 不同路径
 * 一个机器人位于一个 m x n 网格的左上角 （
 * 起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。
 * 机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * <p>
 * 问总共有多少条不同的路径？
 */

public class UniquePaths {
    public static int uniquePaths1(int m, int n) {
//        空值判定
        if (m <= 0 || n <= 0) {
            return 0;
        }
//      初始化 dp数组，对于二维问题，需要初始化起始点和边界
        int[][] dp = new int[m][n]; //
//      求路径可能数，对于边界而言，路径可能数为1
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        // 迭代从1到 m 和 n
       DPVisual dpVisual =new DPVisual();
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
//                dp核心
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                dpVisual.drawDp2(ArrayDemo.toIntegerArray2(dp));
            }
        }
        return dp[m - 1][n - 1];
    }
}
