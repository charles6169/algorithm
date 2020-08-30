package Algorithm.DFS;

import DataStructure.Array.Array;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class PermuteUnique {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        Set<Integer> memory = new HashSet<>();
        Arrays.sort(nums);
        int len = nums.length;
        if (len == 0) {
            return res;
        }
        dfs(nums, len, 0, memory, path, res);
        return res;
    }

    public static void dfs(int[] nums, int len, int depth, Set<Integer> memory, Deque<Integer> path
            , List<List<Integer>> res) {
        if (len == depth) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!memory.contains(i)) {
                if (i > 0 && nums[i] == nums[i - 1]&&!memory.contains(i-1)) {
                    continue;
                }

                memory.add(i);
                path.addLast(nums[i]);
                dfs(nums, len, depth + 1, memory, path, res);
                path.removeLast();
                memory.remove(i);
            }
        }

    }
}
