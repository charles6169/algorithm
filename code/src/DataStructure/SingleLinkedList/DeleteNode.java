package DataStructure.SingleLinkedList;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题 02.03. 删除中间节点
 * 实现一种算法，删除单向链表中间的某个节点
 * （除了第一个和最后一个节点，不一定是中间节点），假定你只能访问该节点。
 */

public class DeleteNode {
    public static ListNode deleteNode1(ListNode head, int val) {
        if (head == null) {
            return head;
        }
//        注意删除的时候单独判断头节点
        if (head.val == val) {
            return head.next;
        }
        ListNode cur = head;
        while (cur != null) {
//            提前判断
            if (cur.next.val == val) {
                cur.next = cur.next.next;
//                及时返回
                return head;
            }
            cur = cur.next;
        }
        return head;
    }
}
