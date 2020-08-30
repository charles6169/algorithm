package DataStructure.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class RangeSumBST {
    public static int rangeSumBST1(TreeNode root, int L, int R) {
        List<Integer> tree = new ArrayList<>();
        helper(root, tree);
        int sum = 0;
        for (int i : tree) {
            if (i >= L && i <= R) {
                sum += i;
            }
        }
        return sum;
    }

    public static void helper(TreeNode root, List<Integer> tree) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, tree);
            }
            tree.add(root.val);
            if (root.right != null) {
                helper(root.right, tree);
            }
        }
    }
}
