package Algorithm.DFS;

import DataStructure.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：98. 验证二叉搜索树
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 */

public class IsValidBST {
//    判断二叉搜索树的经典方法就是中序遍历，然后判断是否单调递增
    List<Integer> res = new ArrayList<>();

    public boolean isValidBST1(TreeNode root) {
        helper(root, res);
        for (int i = 0; i < res.size() - 1; i++) {
//            注意，取等时也不是二叉搜索树
            if (res.get(i + 1) <= res.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void helper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            helper(root.left, list);
        }
        list.add(root.val);
        if (root.right != null) {
            helper(root.right, list);
        }
    }
}
