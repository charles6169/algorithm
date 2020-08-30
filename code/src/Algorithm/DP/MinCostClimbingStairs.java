package Algorithm.DP;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：746. 使用最小花费爬楼梯
 * 数组的每个索引做为一个阶梯，
 * 第 i个阶梯对应着一个非负数的体力花费值 
 * cost[i](索引从0开始)。
 * <p>
 * 每当你爬上一个阶梯你都要花费对应的体力花费值，
 * 然后你可以选择继续爬一个阶梯或者爬两个阶梯。
 * <p>
 * 您需要找到达到楼层顶部的最低花费。在开始时，
 * 你可以选择从索引为 0 或 1 的元素作为初始阶梯。
 */

public class MinCostClimbingStairs {
    //    从后往前 反向计算
    public static int minCostClimbingStairs1(int[] cost) {
//        初始值  c1表示往前一位，c2表示往前两位
        int c1 = 0;
        int c2 = 0;
        for (int i = cost.length - 1; i >= 0; --i) {
//            f[i] = cost[i] + min(f[i+1], f[i+2])
//            dp核心：第 i 级阶梯的总花费 = 第 i 级的cost + 前两级阶梯的总花费的较小者
            int c0 = cost[i] + Math.min(c1, c2);
//            将旧值迭代为新值 往前一位
            c2 = c1;
            c1 = c0;
        }
        return Math.min(c1, c2);
    }
}
