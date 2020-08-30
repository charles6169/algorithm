package Algorithm.DFS;

import DataStructure.Array.ArrayDemo;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class GetPermutation {
    public static String getPermutation(int n, int k) {
//        List<String> res = new ArrayList<>();
        if (n == 0) {
            return "";
        }
        Deque<Integer> path = new ArrayDeque<>();
        Set<Integer> memory = new HashSet<>();
        return dfs(n, k, 0, memory, path);
    }

    public static String dfs(int n, int k, int time, Set<Integer> memory, Deque<Integer> path) {
        if (path.size() == n) {
            if (time == k - 1) {
                StringBuffer stringBuffer = new StringBuffer();
                for (Integer Integer : path) {
                    stringBuffer.append(Integer);
                }
                return stringBuffer.toString();
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!memory.contains(i)) {
                memory.add(i);
                path.addLast(i);
                dfs(n, k, time + 1, memory, path);
                path.removeLast();
                memory.remove(i);
            }
        }
        return "";
    }
}
