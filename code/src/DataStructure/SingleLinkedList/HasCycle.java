package DataStructure.SingleLinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：141. 环形链表
 * 判断是否有链表环
 */

public class HasCycle {
    //    直接法
    public boolean hasCycle(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode first = head;
        ListNode second = head.next;
        int pos = 0;

        while (first.next != null) {
            while (first != second) {
                if (second.next == null) {
                    break;
                }
                second = second.next;
                pos++;
            }
            first = first.next;
        }

        if (pos == 0) {
            return false;
        } else {
            return true;
        }
    }

//    哈希表法，更加简单
    public boolean hasCycle1(ListNode head) {
        Set<ListNode> nodesSeen = new HashSet<>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return true;
            } else {
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }

    //  双指针
    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }


}
