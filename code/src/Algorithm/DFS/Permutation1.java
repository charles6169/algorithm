package Algorithm.DFS;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Permutation1 {
    public static String[] permutation(String S) {
        List<List<Character>> list = new ArrayList<>();
        Deque<Character> path = new ArrayDeque<>();
        Set<Integer> memory = new HashSet<>();
        if (S.length() == 0) {
            return new String[]{};
        }
        dfs(S, 0, path, memory, list);
        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            StringBuffer sb = new StringBuffer();
            for (char c : list.get(i)) {
                sb.append(c);
            }
            res[i] = new String(sb);
        }
        return res;
    }


    public static void dfs(String S, int begin, Deque<Character> path, Set<Integer> memory, List<List<Character>> list) {
        if (path.size() == S.length()) {
            list.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < S.length(); i++) {
            if (!memory.contains(i)) {
                memory.add(i);
                path.addLast(S.charAt(i));
                dfs(S, i + 1, path, memory, list);
                path.remove();
                memory.remove(i);
            }

        }

    }
}
