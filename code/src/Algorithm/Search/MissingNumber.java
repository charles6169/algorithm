package Algorithm.Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题53 - II. 0～n-1中缺失的数字
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，
 * 并且每个数字都在范围0～n-1之内。
 * 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，
 * 请找出这个数字。
 */

public class MissingNumber {
    public static int missingNumber1(int[] nums) {
        int low = 0, high = nums.length;
        while (low < high) {
//            mid为low和high的中间值
            int mid = (low + high) >> 1;
//            如果nums[mid] != mid，那么便可以输出low了，high = mid是为了退出循环
            if (nums[mid] != mid) high = mid;
//            移动low 往上增加
            else low = mid + 1;
        }
//        注意返回的是low
        return low;
    }
}
