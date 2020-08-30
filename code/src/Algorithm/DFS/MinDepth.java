package Algorithm.DFS;

import DataStructure.Tree.TreeNode;
import javafx.util.Pair;

import java.util.LinkedList;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：111. 二叉树的最小深度 DFS版本  待定3月5日
 */

public class MinDepth {
    public int minDepth1(TreeNode root) {
        LinkedList<Pair<TreeNode, Integer>> stack = new LinkedList<>();
        if (root == null) {
            return 0;
        }
        else {
            stack.add(new Pair(root, 1));
        }

        int min_depth = Integer.MAX_VALUE;
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> current = stack.pollLast();
            root = current.getKey();
            int current_depth = current.getValue();
            if ((root.left == null) && (root.right == null)) {
                min_depth = Math.min(min_depth, current_depth);
            }
            if (root.left != null) {
                stack.add(new Pair(root.left, current_depth + 1));
            }
            if (root.right != null) {
                stack.add(new Pair(root.right, current_depth + 1));
            }
        }
        return min_depth;
    }
}
