package DataStructure.SingleLinkedList;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题22. 链表中倒数第k个节点
 * 输入一个链表，输出该链表中倒数第k个节点。
 * 为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。
 * 这个链表的倒数第3个节点是值为4的节点。
 */

public class GetKthFromEnd {
    //    原创
    public static ListNode getKthFromEnd1(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        int temp = 0;
        while (temp < k) {
            fast = fast.next;
            temp++;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.next;
    }

//    官解
    public static ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode former = head, latter = head;
        for (int i = 0; i < k; i++) {
            former = former.next;
        }
        while (former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
}
