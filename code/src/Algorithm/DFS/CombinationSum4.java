package Algorithm.DFS;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class CombinationSum4 {
    public static int combinationSum4(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int min = nums[0];
        int len = nums.length;
        dfs(target, min, len, nums, path, res);
        return res.size();

    }

    public static void dfs(int residue, int min, int len, int[] nums, Deque<Integer> path, List<List<Integer>> res) {
        if (residue == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            path.add(nums[i]);
            if (residue >= min) {
                dfs(residue - nums[i], min, len, nums, path, res);
            }
            path.removeLast();
        }
    }

}
