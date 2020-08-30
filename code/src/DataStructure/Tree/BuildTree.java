package DataStructure.Tree;

import DataStructure.SingleLinkedList.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题07. 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，
 * 请重建该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */

public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int l = preorder.length;
        if (preorder == null || l == 0) {
            return null;
        }
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < l; i++) {
            indexMap.put(inorder[i], i);
        }
        TreeNode res = recur(preorder, 0, l - 1, inorder, 0, l - 1, indexMap);
        return res;

    }

    public static TreeNode recur(int[] preorder, int preStart, int preEnd,
                                 int[] inorder, int inStart, int inEnd, Map<Integer, Integer> indexMap) {
        if (preStart > preEnd) {
            return null;
        }
        int indexNode = preorder[preStart];
        TreeNode root = new TreeNode(indexNode);
        if(preStart==preEnd){
            return root;
        }
        int index = indexMap.get(indexNode);
        int inLeft = index - inStart;
        int inRight = inEnd - index;

        root.left=recur(preorder,preStart+1,preStart+inLeft,
                inorder,inStart,index-1,indexMap);
        root.right=recur(preorder,preEnd-inRight+1,preEnd,
                inorder,index+1,inEnd,indexMap);
        return root;
    }


}


