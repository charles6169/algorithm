package DataStructure.Tree;

import DataStructure.SingleLinkedList.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class SortedListToBST {
    static List<Integer> list = new ArrayList<>();

    public static TreeNode sortedListToBST(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        TreeNode res = recur(0, list.size() - 1);
        return res;
    }

    public static TreeNode recur(int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        if (left == right) {
            return root;
        }
        root.left = recur(left, mid - 1);
        root.right = recur(mid + 1, right);
        return root;
    }

}
