package DataStructure.Array;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：26. 删除排序数组中的重复项
 */

public class RemoveDuplicates {
    //    双指针法
    public int removeDuplicates1(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    //    双指针法优化，当 q - p > 1 时，才进行复制
    public int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                if (q - p > 1) {
                    nums[p + 1] = nums[q];
                }
                p++;
            }
            q++;
        }
        return p + 1;
    }


}
