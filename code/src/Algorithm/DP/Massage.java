package Algorithm.DP;

import DataStructure.Array.ArrayDemo;
import Visualization.DPVisual;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题 17.16. 按摩师
 * 一个有名的按摩师会收到源源不断的预约请求，
 * 每个预约都可以选择接或不接。在每次预约服务之间要有休息时间，
 * 因此她不能接受相邻的预约。给定一个预约请求序列，
 * 替按摩师找到最优的预约集合（总预约时间最长），返回总的分钟数。
 */

public class Massage {
    public static int massage(int[] nums) {
        DPVisual dpVisual = new DPVisual();
        if (nums.length < 1) {
            return nums[0];
        }
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = nums[0] > nums[1] ? nums[0] : nums[1];
        for (int i = 2; i < n; i++) {
            int maxVal = dp[0];
            for (int j = 0; j < i - 1; j++) {
                if (maxVal < dp[j]) {
                    maxVal = dp[j];
                }
            }
            dp[i] = maxVal + nums[i];
            dpVisual.drawDp1(ArrayDemo.toIntegerArray1(dp));
        }



        return dp[n - 1] > dp[n - 2] ? dp[n - 1] : dp[n - 2];
    }
}
