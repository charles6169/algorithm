package DataStructure.SingleLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题06. 从尾到头打印链表
 * 输入一个链表的头节点，
 * 从尾到头反过来返回每个节点的值（用数组返回）。
 */

public class ReversePrint {
    public static int[] reversePrint1(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        List<Integer> list = new ArrayList<Integer>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        int[] arr = list.stream().mapToInt(Integer::valueOf).toArray();
        return arr;
    }
}
