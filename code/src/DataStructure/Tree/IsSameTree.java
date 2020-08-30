package DataStructure.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：100. 相同的树
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */

public class IsSameTree {
    //    原创
    public boolean isSameTree1(TreeNode p, TreeNode q) {
        ArrayList<Integer> arrayList1 = preOrder(p);
        ArrayList<Integer> arrayList2 = preOrder(q);
        if (arrayList1.equals(arrayList2)) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Integer> preOrder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = helper(root, list);
        return list;
    }

    public ArrayList<Integer> helper(TreeNode root, ArrayList<Integer> res) {
        if (root != null) {
            res.add(root.val);
            if (root.left != null) {
                helper(root.left, res);
            }
            if (root.right != null) {
                helper(root.right, res);
            }
        }
        return res;

    }

    //    递归法
    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (q == null || p == null) return false;
        if (p.val != q.val) return false;
        return isSameTree2(p.right, q.right) && isSameTree2(p.left, q.left);
    }

    //    迭代法
    public boolean isSameTree3(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (!check(p, q)) return false;

        // init deques
        ArrayDeque<TreeNode> deqP = new ArrayDeque<TreeNode>();
        ArrayDeque<TreeNode> deqQ = new ArrayDeque<TreeNode>();
        deqP.addLast(p);
        deqQ.addLast(q);

        while (!deqP.isEmpty()) {
            p = deqP.removeFirst();
            q = deqQ.removeFirst();

            if (!check(p, q)) return false;
            if (p != null) {
                // in Java nulls are not allowed in Deque
                if (!check(p.left, q.left)) return false;
                if (p.left != null) {
                    deqP.addLast(p.left);
                    deqQ.addLast(q.left);
                }
                if (!check(p.right, q.right)) return false;
                if (p.right != null) {
                    deqP.addLast(p.right);
                    deqQ.addLast(q.right);
                }
            }
        }
        return true;
    }

//    判断两个树是否相等的检查
    public boolean check(TreeNode p, TreeNode q) {
        // p and q are null
        if (p == null && q == null) return true;
        // one of p and q is null
        if (q == null || p == null) return false;
        if (p.val != q.val) return false;
        return true;
    }


}
