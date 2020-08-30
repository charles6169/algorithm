package DataStructure.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class ConvertBST {
    static List<Integer> list = new ArrayList<>();

    public static TreeNode convertBST(TreeNode root) {
        midrecur(root);
        midrecur2(root, list.size());

        return root;
    }

    public static void midrecur(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            midrecur(root.left);
        }
        list.add(root.val);
        if (root.right != null) {
            midrecur(root.right);
        }
    }

    public static void midrecur2(TreeNode root, int len) {

    }
}
