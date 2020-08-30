package DataStructure.Tree;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class GoodNodes {
    static int res = 1;

    public static int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Deque<Integer> path = new ArrayDeque<>();

        dfs(root, path);
        return res;
    }

    public static void dfs(TreeNode root, Deque<Integer> path) {
        if (root == null) {
            return;
        }
        if (check(path, root.val) && (path.size() != 0)) {
            res++;
        }
        path.addLast(root.val);
        dfs(root.left, path);
        dfs(root.right, path);
        path.removeLast();

    }

    public static boolean check(Deque<Integer> path, int val) {
        for (Integer integer : path) {
            if (integer > val) {
                return false;
            }
        }
        return true;
    }
}
