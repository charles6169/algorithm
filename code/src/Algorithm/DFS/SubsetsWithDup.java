package Algorithm.DFS;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class SubsetsWithDup {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        Set<Integer> memory = new HashSet<>();
        dfs(nums, 0, memory, path, res);
        return res;
    }

    public static void dfs(int[] nums, int begin, Set<Integer> memory, Deque<Integer> path, List<List<Integer>> res) {
        res.add(new ArrayList<>(path));
        for (int i = begin; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !memory.contains(i - 1)) {
                continue;
            }
            if (!memory.contains(i)) {
                memory.add(i);
                path.addLast(nums[i]);
                dfs(nums, begin + 1, memory, path, res);
                path.removeLast();
                memory.remove(i);
            }

        }

    }
}
