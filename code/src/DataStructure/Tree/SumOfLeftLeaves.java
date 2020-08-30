package DataStructure.Tree;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class SumOfLeftLeaves {
        static int sum = 0;

        public static int sumOfLeftLeaves(TreeNode root) {

            if (root == null) {
                return 0;
            }
            if (root.left != null && root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            }
            sumOfLeftLeaves(root.left);
            sumOfLeftLeaves(root.right);
            return sum;
        }
}
