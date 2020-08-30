package DataStructure.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class DistanceK {
    public static List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        recur(root, 0, list);
        if (root.left == target) {
            res.add(root.right.val);
            for (Integer i : list.get(3)) {
                res.add(i);
            }
            return res;
        } else if (root.right == target) {
            res.add(root.left.val);
            for (Integer i : list.get(3)) {
                res.add(i);
            }
            return res;
        } else if (root == target) {
            for (Integer i : list.get(2)) {
                res.add(i);
            }
            return res;
        }
        int depth = 0;
        for (List<Integer> integers : list) {

            for (Integer integer : integers) {
                if (integer == target.val) {
                    break;
                }
            }
            depth++;
        }
        for (Integer integer : list.get(depth - 2)) {
            res.add(integer);
        }
        if (list.get(depth + 2) != null && list.get(depth + 2).size() != 0) {
            for (Integer integer : list.get(depth + 2)) {
                res.add(integer);
            }
        }
        return res;
    }

    public static void recur(TreeNode root, int level, List<List<Integer>> list) {
        if (root == null) {
            return;
        }
        if (list.size() <= level) {
            list.add(level, new ArrayList<>());
        }
        list.get(level).add(root.val);
        recur(root.left, level + 1, list);
        recur(root.right, level + 1, list);

    }
}
