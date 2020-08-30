package Algorithm.DP;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：70.爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */

public class ClimbStairs {
    public static int climbStairs1(int n) {
//        空值判定
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
//        我从哪里来
        dp[1] = 1;
        dp[2] = 2;
//        我到哪里去 从第3项开始 迭代至第n项
        for (int i = 3; i <= n; ++i) {
//            第i项仅与 i - 1 和 i - 2项 相关联
            dp[i] = dp[i - 1] + dp[i - 2];
        }
//        我是谁
        return dp[n];
    }
}
