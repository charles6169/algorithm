package Algorithm.DFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Permute {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        if (nums.length == 0) {
            return res;
        }
        dfs(nums, 0, path, res);
        return res;
    }

    public static void dfs(int[] nums, int begin, Deque<Integer> path, List<List<Integer>> res) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < nums.length; i++) {
            path.addLast(nums[i]);
            dfs(nums, i + 1, path, res);
            path.removeLast();
        }

    }
}
