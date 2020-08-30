package DataStructure.Tree;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class SumEvenGrandparent {
    static int sum = 0;

    public static int sumEvenGrandparent(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.val % 2 == 0) {
            sum += getSonValue(root);
        }
        sumEvenGrandparent(root.left);
        sumEvenGrandparent(root.right);
        return sum;
    }

    public static int getSonValue(TreeNode root) {
        int res = 0;
        if (root.left != null && root.left.left != null) {
            res += root.left.left.val;
        }
        if (root.left != null && root.left.right != null) {
            res += root.left.right.val;
        }
        if (root.right != null && root.right.left != null) {
            res += root.right.left.val;
        }
        if (root.right != null && root.right.right != null) {
            res += root.right.right.val;
        }

        return res;
    }

}
