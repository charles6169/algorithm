package DataStructure.Tree;


import DataStructure.SingleLinkedList.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Flatten {
    public void flatten(TreeNode root) {
        if(root==null) {
            return;
        }
        List<TreeNode> res = new ArrayList<>();
        //前序遍历整棵二叉树
        dfs(root,res);
        TreeNode head = res.get(0);
        res.remove(0);
        head.left = null;
        //遍历链表，将链表中的TreeNode节点前后串联起来
        while(res.size()>0) {
            TreeNode tmp = res.get(0);
            res.remove(0);
            tmp.left = null;
            head.right = tmp;
            head = head.right;
        }
    }

    //前序遍历整棵二叉树，并将遍历的结果放到数组中
    void dfs(TreeNode root, List<TreeNode> res) {
        if(root==null) {
            return;
        }
        res.add(root);
        dfs(root.left,res);
        dfs(root.right,res);
    }


}
