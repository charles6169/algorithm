package DataStructure.SingleLinkedList;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：61. 旋转链表
 */

public class RotateRight {
    //  原创
    public ListNode rotateRight(ListNode head, int k) {
        int length = getLength(head);
        int remainder = k % length;
        if (remainder == 0) {
            return head;
        }
        while (remainder > 0) {
            head = rotateOnce(head);
            remainder--;
        }
        return head;
    }

    public int getLength(ListNode head) {
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }

    public ListNode rotateOnce(ListNode head) {
        ListNode cur = head;
        while (cur.next.next != null) {
            cur = cur.next;
        }
        ListNode temp = cur.next;
        cur.next = null;
        temp.next = head;
        return temp;
    }

    public ListNode rotateRight1(ListNode head, int k) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode old_tail = head;
        int n;
        for (n = 1; old_tail.next != null; n++) {
            old_tail = old_tail.next;
        }
        old_tail.next = head;
        // find new tail : (n - k % n - 1)th node
        // and new head : (n - k % n)th node

        ListNode new_tail = head;
        for (int i = 0; i < n - k % n - 1; i++) {
            new_tail = new_tail.next;
        }
        ListNode new_head = new_tail.next;
        // break the ring
        new_tail.next = null;
        return new_head;
    }

}
