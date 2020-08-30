package DataStructure.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class FindBottomLeftValue {
    public static int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<List<Integer>> list = new ArrayList<>();
        recur(root, 0, list);
        int res = list.get(list.size() - 1).get(0);
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
