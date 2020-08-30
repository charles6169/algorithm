package DataStructure.SingleLinkedList;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：83. 删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 */

public class DeleteDuplicates {
//        直接法
    public ListNode deleteDuplicates1(ListNode head) {
        ListNode cur = head;  //cur地址和head地址相同且关联，cur是操作指针
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
//                核心：删除某元素后一位元素的方法
                ListNode temp = cur.next;
                cur.next = temp.next;
                temp.next = null;//清除野指针
            } else {
                cur = cur.next;
            }

        }
        return head;  //最后直接返回head即可
    }
}
