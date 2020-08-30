package Algorithm.Recurison;

import DataStructure.Tree.TreeNode;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：687. 最长同值路径
 * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。
 * 这条路径可以经过也可以不经过根节点。
 * 注意：两个节点之间的路径长度由它们之间的边数表示。
 */

public class LongestUnivaluePath {
    static int ans;

    public static int longestUnivaluePath1(TreeNode root) {
        ans = 0;
        arrowLength(root);
        return ans;
    }

    public static int arrowLength(TreeNode node) {
//        终止条件
        if (node == null) return 0;
//        主递归体：等价条件 当终止条件不成立时，不会往下运行，直到递到底获得值
        int left = arrowLength(node.left);
        int right = arrowLength(node.right);
//        单级功能 第一次执行单级功能是在主递归体执行完第一次后才执行的
        int arrowLeft = 0, arrowRight = 0;
        if (node.left != null && node.left.val == node.val) {
            arrowLeft += left + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            arrowRight += right + 1;
        }
        ans = Math.max(ans, arrowLeft + arrowRight);
//        返回值
        return Math.max(arrowLeft, arrowRight);
    }

}
