package DataStructure.Tree;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：110. 平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 */

public class IsBalanced {
    //    原创 未实现
    public boolean isBalanced1(TreeNode root) {
        int leftDepth = 0;
        int rightDepth = 0;
        if (root != null) {
            if (root.left != null) {
                leftDepth = getDepth(root.left);
            }
            if (root.right != null) {
                rightDepth = getDepth(root.right);
            }
            if (Math.abs(leftDepth - rightDepth) >= 2) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public int getDepth(TreeNode root) {
        return root == null ? 0 : Math.max(getDepth(root.left), getDepth(root.right));
    }


    // Recursively obtain the height of a tree. An empty tree has -1 height
    private int height(TreeNode root) {
        // An empty tree has height -1
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        // An empty tree satisfies the definition of a balanced tree
        if (root == null) {
//            注意,空树也是平衡树
            return true;
        }
        // Check if subtrees have height within 1. If they do, check if the
        // subtrees are balanced
        return Math.abs(height(root.left) - height(root.right)) < 2
                && isBalanced(root.left)
                && isBalanced(root.right);
    }
}
