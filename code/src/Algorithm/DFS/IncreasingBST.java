package Algorithm.DFS;

import DataStructure.Tree.TreeDemo;
import DataStructure.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：897. 递增顺序查找树
 * 给定一个树，按中序遍历重新排列树，
 * 使树中最左边的结点现在是树的根，
 * 并且每个结点没有左子结点，只有一个右子结点。
 */

public class IncreasingBST {
    static List<Integer> res = new ArrayList<>();

    public static TreeNode increasingBST1(TreeNode root) {
        dfs(root, res);
        TreeNode tree = new TreeNode(res.get(0));
        TreeNode cur = tree;
        for (int i = 1; i < res.size(); i++) {
            cur.right = new TreeNode(res.get(i));
            cur = cur.right;
        }
        return tree;
    }

    public static void dfs(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
//        优先找左边
        dfs(root.left, list);
        list.add(root.val);
//        找完左边再找右边
        dfs(root.right, list);
    }
}
