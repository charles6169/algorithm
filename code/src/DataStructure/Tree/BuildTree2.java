package DataStructure.Tree;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class BuildTree2 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preLen = preorder.length;
        int inLen = inorder.length;
        if (preLen == 0) {
            return null;
        }
        Map<Integer, Integer> inMap = new HashMap<>();

        for (int i = 0; i < inLen; i++) {
            inMap.put(inorder[i], i);
        }

        TreeNode root = recur(0, preLen - 1, preorder, 0, inLen - 1, inorder, inMap);
        return root;
    }

    public TreeNode recur(int preStart, int preEnd, int[] preorder, int inStart, int inEnd,
                          int[] inorder, Map<Integer, Integer> inMap) {
        if (preStart > preEnd) {
            return null;
        }
        int node = preorder[preStart];
        TreeNode root = new TreeNode(node);
        int index = inMap.get(node);
        int leftNodes = index - inStart;
        int rightNodes = inEnd - index;

        root.left = recur(preStart + 1, preStart + leftNodes, preorder, inStart, index - 1, inorder, inMap);
        root.right = recur(preEnd - rightNodes + 1, preEnd, preorder, index + 1, inEnd, inorder, inMap);
        return root;
    }
}
