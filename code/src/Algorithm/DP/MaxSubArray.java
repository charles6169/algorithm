package Algorithm.DP;

import Visualization.DPVisual;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：53. 最大子序和
 * 给定一个整数数组 nums ，
 * 找到一个具有最大和的连续子数组
 * （子数组最少包含一个元素），返回其最大和。
 */

public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
//        空值判定
        if (nums == null || nums.length == 0) {
            return 0;
        }
//        初始dp
        int dp = nums[0];
        int max = nums[0];
        DPVisual dpVisual =new DPVisual();
        for (int i = 1; i < nums.length; i++) {
//            状态转移方程：f(k) = max(num[k], f(k - 1) + num[k])
//            如果nums[i]较dp + nums[i]更大，则替换dp，相当于重置了子数组的位置
            dp = Math.max(dp + nums[i], nums[i]);
//            相当于是把判断上一次dp是否大于0的逻辑移到了max函数里
            dpVisual.drawDp0(dp);
            max = Math.max(max, dp);
        }
        return max;
    }
}
