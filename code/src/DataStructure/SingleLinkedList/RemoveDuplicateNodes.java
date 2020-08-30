package DataStructure.SingleLinkedList;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题 02.01. 移除重复节点
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 */

public class RemoveDuplicateNodes {
    //    哈希集合 未实现
    public static ListNode removeDuplicateNodes1(ListNode head) {
        Set<ListNode> nodes = new HashSet<>();
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null) {
            if (nodes.contains(cur.next)) {
                cur.next = cur.next.next;
            } else {
                nodes.add(cur);
            }
            cur = cur.next;
        }
        return dummy.next;
    }

//    哈希映射，实现
    public static ListNode removeDuplicateNodes2(ListNode head) {
        Map<Integer, Integer> map = new HashMap<>();
        ListNode result = head;
        ListNode pre = null;
        while (head != null) {
            if (map.get(head.val) != null)
                pre.next = head.next;
            else {
                map.put(head.val, 1);
                pre = head;
            }
            head = head.next;
        }
        return result;
    }
}


