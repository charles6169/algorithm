package Algorithm.DFS;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        Set<Integer> memory = new HashSet<>();
        if (nums.length == 0) {
            return res;
        }
        dfs(nums, 0, memory, path, res);
        return res;
    }

    public static void dfs(int[] nums, int begin, Set<Integer> memory, Deque<Integer> path,
                           List<List<Integer>> res) {
        for (int i = begin; i < nums.length; i++) {
            if (i == 0) {
                res.add(new ArrayList<>(path));
                continue;
            }
            if (!memory.contains(i)) {
                memory.add(i);
                path.addLast(i);
                res.add(new ArrayList<>(path));
                dfs(nums, i, memory, path, res);
                path.removeLast();
                memory.remove(i);
            }
        }
    }
}
