package DataStructure.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题03. 数组中重复的数字
 */

public class FindRepeatNumber {
    public static List<Integer> findRepeatNumber1(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        bubbleSort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                list.add(nums[i]);
            }
        }
        return list;
    }

    public static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j + 1] < nums[j]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static int findRepeatNumber2(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums) {
//            set.add(num)返回false时说明已存在某数
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }


}
