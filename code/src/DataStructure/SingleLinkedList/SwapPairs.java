package DataStructure.SingleLinkedList;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：24. 两两交换链表中的节点
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 */

public class SwapPairs {
    //    方法一：递归
    public static ListNode swapPairs(ListNode head) {
//        终止条件
        if ((head == null) || (head.next == null)) {
            return head;
        }

        ListNode firstNode = head;
        ListNode secondNode = head.next;
//       等价条件 交换  单级操作
        firstNode.next = swapPairs(secondNode.next);
        secondNode.next = firstNode;

        return secondNode;

    }
}
