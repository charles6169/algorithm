package DataStructure.SingleLinkedList;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：19. 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 */

public class RemoveNthFromEnd {
    //    方法一：两次遍历算法
    public ListNode removeNthFromEnd1(ListNode head, int n) {
//        设置哑节点
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int l = 0;
//        计算链表长度
        ListNode first = head;
        while (first != null) {
            first = first.next;
            l++;
        }
        l -= n;
        first = dummy;
        while (l > 0) {
            l--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }

    //    方法二：一次遍历算法
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
//        从second位置删除
        second.next = second.next.next;
//        从哑节点返回目标链表
        return dummy.next;
    }


    public static ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k ==0 ){
            return null;
        }

        ListNode slow=head;
        ListNode fast=head;
        for(int i=0;i<k;i++){
            if(fast==null){
                return null;
            }
            fast=fast.next;

        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;

    }
}
