package DataStructure.SingleLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：234. 回文链表
 * 请判断一个链表是否为回文链表。
 */

public class IsPalindrome {
//    双指针法   链表转数组，再做回文数判断
    public static boolean isPalindrome1(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        int front = 0;
        int back = vals.size() - 1;
        while (front < back) {
//            核心
            if (!vals.get(front).equals(vals.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
