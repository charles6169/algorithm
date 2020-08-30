package Algorithm.Recurison;

import DataStructure.Tree.TreeNode;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：111. 二叉树的最小深度 递归版本
 */

public class MinDepth {
    public int minDepth(TreeNode root) {
//        终止条件
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
//        单级功能
        int min_depth = Integer.MAX_VALUE;
        if (root.left != null) {
            min_depth = Math.min(minDepth(root.left), min_depth);
        }
        if (root.right != null) {
            min_depth = Math.min(minDepth(root.right), min_depth);
        }
//        返回值
        return min_depth + 1;
    }
}
