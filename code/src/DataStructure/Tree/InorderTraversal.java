package DataStructure.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：94. 二叉树的中序遍历
 * 给定一个二叉树，返回它的中序 遍历。
 */

public class InorderTraversal {


    // 莫里斯中序遍历
    public List<Integer> inorderTraversal3(TreeNode root) {
        List<Integer> ldr = new ArrayList<Integer>();
        TreeNode cur = root;
        TreeNode pre = null;
        while(cur!=null){
            if(cur.left==null){//左子树为空，输出当前节点，将其右孩子作为当前节点
                ldr.add(cur.val);
                cur = cur.right;
            }
            else{
                pre = cur.left;//左子树
                while(pre.right!=null&&pre.right!=cur){//找到前驱节点，即左子树中的最右节点
                    pre = pre.right;
                }
                //如果前驱节点的右孩子为空，将它的右孩子设置为当前节点。当前节点更新为当前节点的左孩子。
                if(pre.right==null){
                    pre.right = cur;
                    cur = cur.left;
                }
                //如果前驱节点的右孩子为当前节点，将它的右孩子重新设为空（恢复树的形状）。输出当前节点。当前节点更新为当前节点的右孩子。
                if(pre.right==cur){
                    pre.right = null;
                    ldr.add(cur.val);
                    cur = cur.right;
                }
            }
        }
        return ldr;
    }

}
