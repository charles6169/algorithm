package Algorithm.DFS;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class NumTilePossibilities {
    public static int numTilePossibilities(String tiles) {
        List<String> res = new ArrayList<>();
        Deque<Character> path = new ArrayDeque<>();
        Set<Integer> memory = new HashSet<>();
        char[] chars = tiles.toCharArray();
        Arrays.sort(chars);
        dfs(0,chars, path, memory, res);
        return res.size();
    }

    public static void dfs(int begin,char[] chars, Deque<Character> path, Set<Integer> memory, List<String> res) {
        if (path.size() != 0) {
            StringBuffer temp = new StringBuffer();
            for (Character c : path) {
                temp.append(c);
            }
            if (!res.contains(temp.toString())) {
                res.add(temp.toString());
            }
        }


        for (int i = 0; i < chars.length; i++) {
            if (memory.contains(i)) {
                continue;
            }
            memory.add(i);
            path.addLast(chars[i]);
            dfs(i + 1, chars, path, memory, res);
            path.removeLast();
            memory.remove(i);

        }

    }

}
