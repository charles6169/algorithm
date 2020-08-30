package DataStructure.Tree;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题27. 二叉树的镜像
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 */

public class MirrorTree {
    public TreeNode mirrorTree1(TreeNode root) {
        //递归函数的终止条件，节点为空时返回
        if(root==null) {
            return null;
        }
        //下面三句是将当前节点的左右子树交换
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        //递归交换当前节点的 左子树
        mirrorTree1(root.left);
        //递归交换当前节点的 右子树
        mirrorTree1(root.right);
        //函数返回时就表示当前这个节点，以及它的左右子树
        //都已经交换完了
        return root;
    }
}
