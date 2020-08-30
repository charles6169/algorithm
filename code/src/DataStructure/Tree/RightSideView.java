package DataStructure.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class RightSideView {
    public static List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        recur(root, 0, list);

        for (List<Integer> l : list) {
            res.add(l.get(l.size() - 1));
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
