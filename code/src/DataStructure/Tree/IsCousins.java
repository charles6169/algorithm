package DataStructure.Tree;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：993. 二叉树的堂兄弟节点
 */

public class IsCousins {
    Map<Integer, Integer> depth;
    Map<Integer, TreeNode> parent;
//    深度优先搜索
    public boolean isCousins1(TreeNode root, int x, int y) {
        depth = new HashMap<>();
        parent = new HashMap<>();
        dfs(root, null);
        return (depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y));
    }

    public void dfs(TreeNode node, TreeNode par) {
        if (node != null) {
            depth.put(node.val, par != null ? 1 + depth.get(par.val) : 0);
            parent.put(node.val, node);
            dfs(node.left, node);
            dfs(node.right, node);
        }
    }
}

