package DataStructure.SingleLinkedList;

import DataStructure.SingleLinkedList.ListNode;

import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：反转链表
 */

public class ReverseList {
    //    递归法 无法实现？
    public static ListNode reverseList1(ListNode head) {
//        终止条件
        if (head == null || head.next == null) {
            return head;
        }
//        等价关系
        ListNode newList = reverseList1(head.next);
//        单级任务
        newList.next.next = head; //有bug
        head.next = null;
        return newList;
    }


    //    迭代法 可实现  官方解法：TCPC
    public static ListNode reverseList2(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
//            核心 记忆为四个进行了一个交换操作
            ListNode tempNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNode;
        }
        return prev;
    }
//    public static ListNode reverseList2(ListNode head) {
//        ListNode cur = head;
//        stack<ListNode> stack = new stack<>();
//        while (cur != null) {
//            stack.push(cur);
//            cur = cur.next;
//        }
//        ListNode dummy = new ListNode(-1);
//        ListNode cur1 = dummy;
//        while (!stack.isEmpty()) {
//            cur1.next = stack.pop();
//            cur1 = cur1.next;
//        }
//        return dummy.next;
//    }
}
