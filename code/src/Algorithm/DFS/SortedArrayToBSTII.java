package Algorithm.DFS;

import DataStructure.Tree.TreeNode;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：108. 将有序数组转换为二叉搜索树
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 */

public class SortedArrayToBSTII {
    static int[] nums;

    //    中序遍历：始终选择中间位置左边元素作为根节点
    public static TreeNode sortedArrayToBST1(int[] num) {
        nums = num;
        return helper(0, nums.length - 1);
    }

    public static TreeNode helper(int left, int right) {
//        终止条件
        if (left > right) {
            return null;
        }
//        单级功能
        int p = (left + right) / 2;
        TreeNode root = new TreeNode(nums[p]);
//        递归体，分别左右节点计算
        root.left = helper(left, p - 1);
        root.right = helper(p + 1, right);
        return root;
    }
}
