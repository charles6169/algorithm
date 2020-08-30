package DataStructure.Array;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题21. 调整数组顺序使奇数位于偶数前面
 */

public class Exchange {
//    双指针 原地交换
    public int[] exchange1(int[] nums) {
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                start++;
            }
        }
        return nums;
    }
}
