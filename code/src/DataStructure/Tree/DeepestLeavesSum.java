package DataStructure.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class DeepestLeavesSum {
    public static int deepestLeavesSum(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, 0, res);
        int sum = 0;
        for (Integer integer : res.get(res.size() - 1)) {
            sum += integer;
        }
        return sum;
    }

    public static void dfs(TreeNode root, int level, List<List<Integer>> res) {
        if(root==null){
            return;
        }
        if (res.size() <= level) {
            res.add(level, new ArrayList<>());
        }
        res.get(level).add(root.val);
        dfs(root.left, level + 1, res);
        dfs(root.right, level + 1, res);
    }

}
