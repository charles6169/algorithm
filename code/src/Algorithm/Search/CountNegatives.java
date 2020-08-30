package Algorithm.Search;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class CountNegatives {
    public static int countNegatives(int[][] grid) {
        int n = grid[0].length;
        int res = 0;
        for (int[] g : grid) {
            res += n - biSearch(g);
        }
        return res;
    }

    public static int biSearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] >= 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
