package Algorithm.DFS;

import DataStructure.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：112. 路径总和
 * 给定一个二叉树和一个目标和，
 * 判断该树中是否存在根节点到叶子节点的路径，
 * 这条路径上所有节点值相加等于目标和。
 */

public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
//        终止条件
        if (root == null) {
            return false;
        }
//        单级功能
        sum -= root.val;
        if ((root.left == null) && (root.right == null)) {
            return (sum == 0);
        }
//        等价关系，对左子树和右子树实行相同的策略，递归
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}
