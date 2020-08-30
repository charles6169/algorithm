package Algorithm.DFS;

import DataStructure.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：872. 叶子相似的树
 * 请考虑一颗二叉树上所有的叶子，
 * 这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。
 */

public class LeafSimilar {
    static List<Integer> res1 = new ArrayList<>();
    static List<Integer> res2 = new ArrayList<>();

    public static boolean leafSimilar1(TreeNode root1, TreeNode root2) {
        getLeaf(root1, res1);
        getLeaf(root2, res2);
        if (res1.equals(res2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void getLeaf(TreeNode root, List<Integer> res) {
//        空值判定
        if (root == null) {
            return;
        }
//        单级功能
        if ((root.left == null) && (root.right == null)) {
            res.add(root.val);
        }
//        递归体，分别对左右子树深度搜索
        getLeaf(root.left, res);
        getLeaf(root.right, res);
//        这种格式下，最后一步为自动回溯
    }
}
