package Algorithm.DP;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：64. 最小路径和
 * 给定一个包含非负整数的 m x n 网格，
 * 请找出一条从左上角到右下角的路径，
 * 使得路径上的数字总和为最小。
 *
 * 每次只能向下或者向右移动一步。
 */

public class MinPathSum {
    public static int minPathSum1(int[][] grid) {
//        注意：对于二维数组而言，行是直接求length，列是第0项的length
        int m = grid.length;
        int n = grid[0].length;
//        空值判定 注意是小于等于
        if (m <= 0 || n <= 0) {
            return 0;
        }
//        初始化dp矩阵
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
//        针对边界进行单独初始化 注意 是 < m和n
        for (int i = 1; i < m; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }
//        直接迭代
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
//                dp核心:第i,j项为 i-1,j项 与 i,j-1项 较小的那一个 和 网格的第i,j项的和
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
//        返回值
        return dp[m - 1][n - 1];
    }
}
