package Algorithm.Recurison;

import DataStructure.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：783. 二叉搜索树结点最小距离
 * 给定一个二叉搜索树的根结点 root,
 * 返回树中任意两节点的差的最小值。
 */

public class MinDiffInBST {
    //    递归，原创，未实现
    static int ans;

    public static int minDiffInBST1(TreeNode root) {
        ans = 0;
        minDiff(root);
        return ans;
    }

    public static int minDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = minDiff(root.left);
        int right = minDiff(root.right);

        int leftDiff = 0, rightDiff = 0;
        if (root.left != null) {
            leftDiff = Math.abs(root.val - root.left.val);
        }
        if (root.right != null) {
            rightDiff = Math.abs(root.val - root.right.val);
        }
        int minTemp = Math.min(leftDiff, rightDiff);
        ans = Math.min(ans, minTemp);
        return minTemp;
    }

//    官解
    public static int minDiffInBST2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        helper(root, res);
        for (int i = 0; i < res.size() - 1; i++) {
            ans.add(Math.abs(res.get(i + 1) - res.get(i)));
        }
        for (int i = 0; i < ans.size() - 1; i++) {
            for (int j = 0; j < ans.size() - 1 - i; j++) {
                if (ans.get(j) > ans.get(j + 1)) {
                    int temp = ans.get(j + 1);
                    ans.set(j + 1, ans.get(j));
                    ans.set(j, temp);
                }
            }
        }
        return ans.get(0);
    }

    public static void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                helper(root.right, res);
            }
        }
    }
}
