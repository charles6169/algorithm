package Algorithm.DFS;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Combine {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        Set<Integer> memory = new HashSet<>();
        if (n == 0) {
            return res;
        }
        dfs(n, k, 1,0, memory,
                path, res);
        return res;
    }

    public static void dfs(int n, int k, int begin,int depth, Set<Integer> memory,
                           Deque<Integer> path, List<List<Integer>> res) {
        if (depth == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i <= n; i++) {
            if (!memory.contains(i)) {
                memory.add(i);
                path.addLast(i);
                dfs(n, k, i,depth + 1, memory,
                        path, res);
                path.removeLast();
                memory.remove(i);
            }
        }
    }
}
