package DataStructure.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class LargestValues {
    public static List<Integer> largestValues(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        recur(root, 0, list);
        for (List<Integer> li : list) {
            int max=li.get(0);
            for (Integer i : li) {
                if (i > max) {
                    max = i;
                }
            }
            res.add(max);
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
