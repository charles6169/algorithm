package DataStructure.Tree;

import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：多叉树节点
 */

public class TreeNodeN {
    public int val;
    public List<TreeNodeN> children;

    public TreeNodeN() {}

    public TreeNodeN(int _val) {
        val = _val;
    }

    public TreeNodeN(int _val, List<TreeNodeN> _children) {
        val = _val;
        children = _children;
    }
}
