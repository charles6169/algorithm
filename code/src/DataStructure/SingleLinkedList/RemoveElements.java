package DataStructure.SingleLinkedList;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：删除指定元素
 */

public class RemoveElements {
    //    哑节点法
    public static ListNode removeElements1(ListNode head, int val) {
        ListNode dummyNode = new ListNode(val - 1);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        while (pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        return dummyNode.next;
    }

//    递归法
    public ListNode removeElements2(ListNode head, int val) {
//        终止条件
        if (head == null) {
            return null;
        }
//        等价关系
        head.next = removeElements2(head.next, val);
//        单级任务
        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }
}
