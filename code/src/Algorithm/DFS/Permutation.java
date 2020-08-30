package Algorithm.DFS;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Permutation {
    public static String[] permutation(String S) {
        List<String> list = new ArrayList<>();
        Deque<Character> path = new ArrayDeque<>();
        Set<Integer> memory = new HashSet<>();
//        String[] res=new String[];
        dfs(S, path, memory, list);
        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void dfs(String S, Deque<Character> path, Set<Integer> memory, List<String> list) {
        if (path.size() == S.length()) {
            StringBuilder temp=new StringBuilder();
            for (Character c : path) {
                temp.append(c);
            }
            list.add(temp.toString());
        }
        for (int i = 0; i < S.length(); i++) {
            if (!memory.contains(i)) {
                memory.add(i);
                path.addLast(S.charAt(i));
                dfs(S, path, memory, list);
                path.removeLast();
                memory.remove(i);
            }

        }


    }

}
