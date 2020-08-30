package DataStructure.Tree;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：104. 二叉树的最大深度
 */

public class MaxDepth {
    //    递归
    public int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left_height = maxDepth1(root.left);
            int right_height = maxDepth1(root.right);
            return Math.max(left_height, right_height) + 1;
        }
    }

    //    迭代
    public int maxDepth2(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> stack = new LinkedList<>();
        if (root != null) {
            stack.add(new Pair(root, 1));
        }
        int depth = 0;
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> current = stack.poll();
            root = current.getKey();
            int current_depth = current.getValue();
            if (root != null) {
                depth = Math.max(depth, current_depth);
                stack.add(new Pair(root.left, current_depth + 1));
                stack.add(new Pair(root.right, current_depth + 1));
            }
        }
        return depth;
    }
}
