package DataStructure.SingleLinkedList;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：86. 分隔链表
 * 给定一个链表和一个特定值 x，对链表进行分隔，
 * 使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 * 你应当保留两个分区中每个节点的初始相对位置。
 */

public class Partition {
    //    原创
    public ListNode partition1(ListNode head, int x) {
        ListNode l1 = new ListNode(-1);
        ListNode cur1 = l1;
        ListNode l2 = new ListNode(-1);
        ListNode cur2 = l2;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val < x) {
                cur1.next = cur;
                cur1 = cur1.next;
            } else {
                cur2.next = cur;
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
//        bug  如果没有这条语句会报错
        cur2.next=null;
        cur1.next = l2.next;
        return l1.next;
    }

//    双指针法 前指针和后指针
    public ListNode partition2(ListNode head, int x) {
//        创建两个哑节点
        ListNode before_head = new ListNode(0);
        ListNode before = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;

        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        // Last node of "after" list would also be
        // ending node of the reformed list
        after.next = null;
        before.next = after_head.next;
        return before_head.next;
    }
}
