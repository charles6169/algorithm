package DataStructure.Tree;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class MaxAncestorDiff {
    static List<Integer> list = new ArrayList<>();

    public static int maxAncestorDiff(TreeNode root) {
        Deque<Integer> path = new ArrayDeque<>();
        recur(root, path);
        return getMax(list);
    }

    public static void recur(TreeNode root, Deque<Integer> path) {
        if (root == null) {
            return;
        }

        path.addLast(root.val);
        if (root.left == null && root.right == null) {
            int[] arr=new ArrayList<>(path).stream().mapToInt(Integer::valueOf).toArray();
            Arrays.sort(arr);
            list.add(arr[arr.length - 1] - arr[0]);
        }
        recur(root.left, path);
        recur(root.right, path);
        path.removeLast();
    }


    public static int getMax(List<Integer> li) {
        int max = 0;
        for (int i = 0; i < li.size(); i++) {
            if (li.get(i) > max) {
                max = li.get(i);
            }
        }
        return max;
    }
}
