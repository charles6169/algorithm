package Visualization;

import DataStructure.SingleLinkedList.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class SingleLinkedVisual<T> {

    public void drawSingleLinked(ListNode head) {
        List<Integer> res = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            res.add(cur.val);
            cur = cur.next;
        }
        System.out.print("head: ");
        System.out.print(res);
        System.out.println();
    }
}
