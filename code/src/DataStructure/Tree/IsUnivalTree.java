package DataStructure.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：965. 单值二叉树
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
 * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
 */

public class IsUnivalTree {
//    遍历＋比较即可
    public boolean isUnivalTree1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        for (int i : res) {
            if (i != res.get(0)) {
                return false;
            }
        }
        return true;
    }

    public void helper(TreeNode root, List<Integer> res) {
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
