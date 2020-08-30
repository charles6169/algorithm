package Algorithm.Recurison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class CanPartitionKSubsets {
    public static boolean canPartitionKSubsets1(int[] nums, int k) {
//        用stream计算数组的和
        int sum = Arrays.stream(nums).sum();
        if (sum % k > 0) return false;
        int target = sum / k;
//        默认升序排序
        Arrays.sort(nums);
        int row = nums.length - 1;
//        若最大值大于了target
        if (nums[row] > target) return false;
//        如果最大值就是target，单独成为一个子集，k也减1
        while (row >= 0 && nums[row] == target) {
            row--;
            k--;
        }
        return search(new int[k], row, nums, target);
    }

    public static boolean search(int[] groups, int row, int[] nums, int target) {
        if (row < 0) return true;
        int v = nums[row--];
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] + v <= target) {
                groups[i] += v;
                if (search(groups, row, nums, target)) return true;
                groups[i] -= v;
            }
            if (groups[i] == 0) break;
        }
        return false;
    }
}
