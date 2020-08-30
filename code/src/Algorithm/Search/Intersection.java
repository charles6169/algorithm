package Algorithm.Search;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums2);
        for (int num : nums1) {
            if (binSearch(nums2, num) && !set.contains(num)) {
                set.add(num);
            }
        }
        Iterator var = set.iterator();
        while (var.hasNext()) {
            res.add((Integer) var.next());
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static boolean binSearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
