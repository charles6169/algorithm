package DataStructure.SingleLinkedList;

import DataStructure.Queue.QueueArray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class ReorderList {
//    原创，可实现
    public static ListNode reorderList1(ListNode head) {
//        切分链表
        ListNode cur = head;
        int length = 1;
        while (cur.next != null) {
            length++;
            cur = cur.next;
        }
        int pos = length / 2;
        ListNode tCur = head;
        int tLength = 1;
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);
        while (tCur.next != null) {
            if (pos == tLength++) {
                l2.next = tCur.next;
                tCur.next = null;
                l1.next = head;
                break;
            }
            tCur = tCur.next;
        }
//        反转链表
        ListNode curr = l2.next;
        ListNode prev = null;
        while (curr != null) {
            ListNode tempNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNode;
        }
        l2.next = prev;

        ListNode tCurr1 = l1.next;
        ListNode tCurr2 = l2.next;

//        合并链表
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        Queue<Integer> queue3 = new LinkedList<>();
        while (tCurr1 != null) {
            queue1.offer(tCurr1.val);
            tCurr1 = tCurr1.next;
        }
        while (tCurr2 != null) {
            queue2.offer(tCurr2.val);
            tCurr2 = tCurr2.next;
        }
        while (!queue1.isEmpty()) {
            queue3.offer(queue1.poll());
            queue3.offer(queue2.poll());
        }
        queue3.offer(queue2.poll());

        ListNode res = new ListNode(-1);
        ListNode tCurr3 = res;
        while (!queue3.isEmpty()) {
            tCurr3.next = new ListNode(queue3.poll());
            tCurr3 = tCurr3.next;
        }
        return res.next;

    }

//    官解
    public static void reorderList2(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;
        //slow、fast起始指向头节点(不是哑结点)，执行以下循环后，将链表一分为二，
        //第一段： [head,pre]，第二段[slow,fast]，
        //如果原链表节点为奇数个，fast不为null,
        //如果原链表节点为偶数个，fast为null,
        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;

        //将第二段链表翻转,翻转之后头节点为 preNode
        ListNode preNode = null;
        ListNode curNode = slow;
        ListNode nextNode = null;
        while(curNode != null){
            nextNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
        }
        //将两段链表合并为一段
        ListNode header = new ListNode(Integer.MAX_VALUE);
        ListNode list = header;
        while(head != null && preNode != null){
            list.next = head;
            head = head.next;

            list.next.next = preNode;
            preNode = preNode.next;

            list = list.next.next;
        }
        if(preNode != null){
            list.next = preNode;
        }
        head = header.next;
    }
}
