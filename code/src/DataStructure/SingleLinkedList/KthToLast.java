package DataStructure.SingleLinkedList;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class KthToLast {
    public static int kthToLast(ListNode head, int k) {
        ListNode cur = head;
        int length = 1;
        while (cur.next != null) {
            cur = cur.next;
            length++;
        }
        int index = length - k;
        ListNode cur1 = head;
        while (index > 0) {
            cur1 = cur1.next;
            index--;
        }
        return cur1.val;
    }
}
