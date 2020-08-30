package DataStructure.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：226. 翻转二叉树
 * 翻转一棵二叉树。
 * 翻转二叉树和镜像二叉树是一个概念，代码一样
 */

public class InvertTree {
    // 先序遍历--从顶向下交换
    public static TreeNode invertTree1(TreeNode root) {
        //递归函数的终止条件，节点为空时返回
        if(root==null) {
            return null;
        }
        //下面三句是将当前节点的左右子树交换
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        //递归交换当前节点的 左子树
        invertTree1(root.left);
        //递归交换当前节点的 右子树
        invertTree1(root.right);
        //函数返回时就表示当前这个节点，以及它的左右子树
        //都已经交换完了
        return root;
    }

//    利用层次遍历
    public static TreeNode invertTree2(TreeNode root) {
        // 层次遍历--直接左右交换即可
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            TreeNode rightTree = node.right;
            node.right = node.left;
            node.left = rightTree;
            if (node.left != null){
                queue.offer(node.left);
            }
            if (node.right != null){
                queue.offer(node.right);
            }
        }
        return root;
    }
}
