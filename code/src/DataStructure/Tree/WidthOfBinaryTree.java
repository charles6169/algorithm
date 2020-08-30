package DataStructure.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class WidthOfBinaryTree {

    public static int widthOfBinaryTree(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        recur(root, 0, res);
        int temp = 0;
        for (List<Integer> re : res) {
            if (temp < re.size()) {
                temp=re.size();
            }
        }
        return temp;
    }

    public static void recur(TreeNode root, int level, List<List<Integer>> res) {
        if(root==null){
            return;
        }
        if (res.size() <= level) {
            res.add(level, new ArrayList<>());
        }
        res.get(level).add(root.val);
        recur(root.left, level + 1, res);
        recur(root.right, level + 1, res);
    }


}
