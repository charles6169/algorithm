package DataStructure.Tree;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class ZigzagLevelOrder {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        recur(root, 0, res);
        for (int i = 0; i < res.size(); i++) {
            if (i % 2 == 1) {
                Collections.reverse(res.get(i));
            }
        }

        return res;
    }

    public static void recur(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() <= level) {
            res.add(level, new ArrayList<>());
        }
        res.get(level).add(root.val);
        recur(root.left, level + 1, res);
        recur(root.right, level + 1, res);
    }



}
