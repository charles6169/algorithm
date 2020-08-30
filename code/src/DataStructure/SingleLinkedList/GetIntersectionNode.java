package DataStructure.SingleLinkedList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：160. 相交链表
 * 编写一个程序，找到两个单链表相交的起始节点。
 */

public class GetIntersectionNode {
//    哈希表法
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        Set<ListNode> nodes = new HashSet<>();
        ListNode cur1 = headA;
        while (cur1 != null) {
            nodes.add(cur1);
            cur1 = cur1.next;
        }
        ListNode cur2 = headB;
        while (cur2 != null) {
            if (nodes.contains(cur2)) {
                return cur2;
            }
            cur2 = cur2.next;
        }
        return null;
    }
}
