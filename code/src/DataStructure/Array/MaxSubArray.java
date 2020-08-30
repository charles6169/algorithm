package DataStructure.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题42. 连续子数组的最大和
 * 输入一个整型数组，数组里有正数也有负数。
 * 数组中的一个或连续多个整数组成一个子数组。
 * 求所有子数组的和的最大值。
 */

public class MaxSubArray {
    public static int maxSubArray1(int[] nums) {
//        初始化最大值为第一项
        int max = nums[0];
//        注意 i到 nums.length
        for (int i = 1; i < nums.length; i++) {
//            如果前一项大于0才相加
            if (nums[i - 1] > 0) {
//                注意是nums[i]与前一项相加,不是max
                nums[i] += nums[i - 1];
            }
//            如果当前项大于最大值，则交换最大值
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
