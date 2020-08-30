package Algorithm.DFS;

import DataStructure.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题34. 二叉树中和为某一值的路径
 * 输入一棵二叉树和一个整数，
 * 打印出二叉树中节点值的和为输入整数的所有路径。
 * 从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 */

public class PathSum {
    //    原创 未实现
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> list = new ArrayList<>();

    public static List<List<Integer>> pathSum1(TreeNode root, int sum) {
        dfs(root, sum);
        return res;
    }

    public static void dfs(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        sum -= root.val;
        list.add(root.val);
        if ((root.left == null) && (root.right == null)) {
            if (sum == 0) {
                res.add(list);
                list.clear();
            }
        }
        dfs(root.left, sum);
        dfs(root.right, sum);
        list.remove(list.size() - 1);
    }

//    深度优先搜索
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        dfs(root, new LinkedList<>(), 0, sum, ans);
        return ans;
    }

    public void dfs(TreeNode root, List<Integer> path, int curSum, int sum, List<List<Integer>> ans) {
//        单级功能
        path.add(root.val);
        curSum += root.val;
//        主递归体
        if (root.left != null) {
            dfs(root.left, path, curSum, sum, ans);
        }
        if (root.right != null) {
            dfs(root.right, path, curSum, sum, ans);
        }
//        终止条件
        if (root.left == null && root.right == null && curSum == sum) {
//            注意这一步
            List<Integer> tmp = new LinkedList<>(path);
            ans.add(tmp);
        }
//        注意回溯到上一步
        path.remove(path.size() - 1);
        curSum -= root.val;

    }
}
