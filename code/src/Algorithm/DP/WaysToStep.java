package Algorithm.DP;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题 08.01. 三步问题
 * 三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，
 * 小孩一次可以上1阶、2阶或3阶。实现一种方法，
 * 计算小孩有多少种上楼梯的方式。结果可能很大，
 * 你需要对结果模1000000007。
 */

public class WaysToStep {
    public static int waysToStep1(int n) {
        long[] dp = new long[n + 3];
//        前三项其实是预设的，n=1时，实际输出为dp[3],计算可得为1
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        for (int i = 3; i < (n + 3); i++) {
//            转移方程
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000007L;
        }
//        注意返回dp[n + 2]
        return (int) dp[n + 2];

    }
}
