package DataStructure.Tree;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：102. 二叉树的层次遍历
 */

public class LevelOrderBottom {
    //    双队列实现层次遍历
//    采用两个队列来实现，一个队列遍历当前层，一个队列存储下一层，交替使用，达到目的
    public static List<List<Integer>> levelOrderBottom1(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.offer(root);
        //如果未遍历完，则一定有一个队列不为空，一个为空
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            //创建一个集合来存储当前层的数据
            List<Integer> sub = new ArrayList<>();

            if (!queue1.isEmpty()) {//queue1不为空，则存储当前层数据
                while (!queue1.isEmpty()) { //遍历当前层
                    TreeNode cur = queue1.poll();

                    sub.add(cur.val); //将当前层元素添加到集合中

                    //如果子节点不为空则将子节点添加到另一个队列中
                    if (cur.left != null) {
                        queue2.offer(cur.left);
                    }
                    if (cur.right != null) {
                        queue2.offer(cur.right);
                    }
                }
            } else {//queue2存储当前层数据
                while (!queue2.isEmpty()) {
                    TreeNode cur = queue2.poll();
                    sub.add(cur.val);
                    if (cur.left != null) {
                        queue1.offer(cur.left);
                    }
                    if (cur.right != null) {
                        queue1.offer(cur.right);
                    }
                }
            }
            //将这一层的数据添加到结果集合中
            list.add(sub);
        }
        //反转
        Collections.reverse(list);
        return list;
    }

//    深搜实现层次遍历  要求掌握
    public static List<List<Integer>> levelOrderBottom2(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        dfs(root, 0, list);
        return list;
    }

    public static void dfs(TreeNode root, int level, List<List<Integer>> list) {
//        终止条件
        if (root == null) {
            return;
        }
//        单级功能       注意这里的写法
//        建立每层数的结构
        if (list.size() <= level) {
            list.add(level, new ArrayList<Integer>());
        }
//        为每层的列表添加值
        list.get(level).add(root.val);
//        递归主体
        dfs(root.left, level + 1, list);
        dfs(root.right, level + 1, list);
    }

}
