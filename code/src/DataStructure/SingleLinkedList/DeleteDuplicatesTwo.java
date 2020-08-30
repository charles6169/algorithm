package DataStructure.SingleLinkedList;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 * 82. 删除排序链表中的重复元素 II
 * 给定一个排序链表，删除所有含有重复数字的节点，
 * 只保留原始链表中 没有重复出现 的数字。
 */

public class DeleteDuplicatesTwo {
    //  虚拟头结点解法
    public ListNode deleteDuplicates2(ListNode head) {
        if (head == null){
            return null;
        }
        // 设置哑结点,防止头结点也是重复元素时，删除不好处理。
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode res = dummy;
        while (dummy.next != null){
            int val = dummy.next.val;
            // 判断dummy.next这个结点的值是否与下一个结点的值相等
            // 如果相等，就把后面与其相等的就全部遍历出来
            if (dummy.next.next != null && dummy.next.next.val == val){
                ListNode temp = dummy.next.next;
                //temp最终指向与val不同的下一个结点或者null
                while (temp != null && temp.val == val ){
                    temp = temp.next;
                }
                dummy.next = temp;
            }else {
                dummy = dummy.next;
            }
        }
        //删除虚拟头结点,返回结果
        return res = res.next;
    }
}
