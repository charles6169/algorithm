package DataStructure.Tree;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class BuildTree1 {
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inMap = new HashMap<>();
        int inLen = inorder.length;
        int postLen = postorder.length;
        for (int i = 0; i < inLen; i++) {
            inMap.put(inorder[i], i);
        }

        TreeNode res=recur(0, inLen - 1, inorder, 0, postLen - 1, postorder, inMap);

        return res;
    }

    public static TreeNode recur(int inStart, int inEnd, int[] inorder,
                          int postStart, int postEnd, int[] postorder, Map<Integer, Integer> inMap) {
        if (inStart > inEnd) {
            return null;
        }
        int node = postorder[postEnd];
        TreeNode root = new TreeNode(node);
        int index = inMap.get(node);
        int leftNodes = index - inStart;
        int rightNodes = inEnd - index;

        root.left = recur(inStart, index - 1, inorder, postStart, postStart + leftNodes - 1, postorder, inMap);
        root.right = recur(index + 1, inEnd, inorder, postStart + leftNodes, postStart + leftNodes + rightNodes - 1, postorder, inMap);

        return root;
    }


}
