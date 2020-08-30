package DataStructure.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class SumNumbers {
    static int res;

    public static int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Deque<Integer> path = new ArrayDeque<>();

        recur(root, path);
        return res;
    }

    public static void recur(TreeNode root, Deque<Integer> path) {
        if (root == null) {
            return;
        }
        path.addLast(root.val);
        if (root.left == null && root.right == null) {
            res += cal(path);
        }
        recur(root.left, path);
        recur(root.right, path);
        path.removeLast();
    }

    public static int cal(Deque<Integer> path) {
        int sum = 0;
        List<Integer> list = new ArrayList<>(path);
        int pow = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            sum += list.get(i) * Math.pow(10, pow);
            pow++;
        }
        return sum;
    }
}
