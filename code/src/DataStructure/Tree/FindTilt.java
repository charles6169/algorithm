package DataStructure.Tree;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：563. 二叉树的坡度
 * 给定一个二叉树，计算整个树的坡度。
 * <p>
 * 一个树的节点的坡度定义即为，
 * 该节点左子树的结点之和和右子树结点之和的差的绝对值。
 * 空结点的的坡度是0。
 * 整个树的坡度就是其所有节点的坡度之和。
 */

public class FindTilt {
    public static int tilt = 0;

    public static int findTilt1(TreeNode root) {
        traverser(root);
        return tilt;
    }

    public static int traverser(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = traverser(root.left);
        int right = traverser(root.right);
        tilt += Math.abs(left - right);
        return left + right + root.val;
    }
}
