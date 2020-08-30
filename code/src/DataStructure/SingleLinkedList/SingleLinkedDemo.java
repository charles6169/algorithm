package DataStructure.SingleLinkedList;


import Visualization.SingleLinkedVisual;
import sun.misc.Launcher;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：单链表基础操作  增删改查
 * 获取链表长度
 * 尾部插入新值
 * 头部插入新值
 * 任意部位插入新值
 * 任意部位删除值
 *
 */

public class SingleLinkedDemo {

    private static SingleLinkedVisual singleLinkedVisual=new SingleLinkedVisual();
    //    获取链表长度
    public static int getLength(ListNode head) {
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }

    //    位置参数判断
    public static void posJudge(ListNode head, int pos) {
        int length = getLength(head);
        if (pos < 0) {
            System.out.println("输入参数过小");
            return;
        }
        if (pos > length) {
            System.out.println("输入参数过大");
            return;
        }
    }


    //    数组转链表
    public static ListNode arrToList(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("数组不能为空!");
        }
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }

    //    尾部插入新值
    public static ListNode addLastNode(ListNode head, int data) {
        ListNode tNode = new ListNode(data);
        if (head == null) {
            head = tNode;
            return head;
        }
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = tNode;
        return head;
    }

    //    头插法
    public static ListNode addHeadNode(ListNode head, int data) {

        ListNode tNode = new ListNode(data);
        if (head == null) {
            head = tNode;
            return head;
        }
        ListNode cur = head;
        singleLinkedVisual.drawSingleLinked(head);
        tNode.next = cur;
        singleLinkedVisual.drawSingleLinked(head);
        head = tNode;
        singleLinkedVisual.drawSingleLinked(head);
        return head;
    }

    //    指定位置插入节点
    public static ListNode insertNodeByIndex(ListNode head, int pos, int data) {
        int length = getLength(head);
        posJudge(head, pos);
        ListNode res;
        if (pos == 1) {
            res = addHeadNode(head, data);
            return res;
        } else if (pos == length + 1) {
            res = addLastNode(head, data);
            return res;
        } else {
            ListNode cur = head;
            ListNode tNode = new ListNode(data);
//            寻找指定位置的方法
            int tLength = 1;
            while (cur.next != null) {
                if (pos == ++tLength) {
//                    核心
                    tNode.next = cur.next;
                    cur.next = tNode;
                    break;
                }
                cur = cur.next;
            }
            return head;
        }

    }

    //    删除指定位置元素
    public static ListNode delNodeByIndex(ListNode head, int pos) {
        posJudge(head, pos);
        ListNode cur = head;
        int tLength = 1;
        while (cur.next != null) {
            if (pos == ++tLength) {
//                删除的方法
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }
        return head;
    }


    //    打印链表
    public static void printListNode(ListNode head) {
        StringBuilder res = new StringBuilder();
        ListNode cur = head;
        while (cur != null) {
            res.append(cur.val + "->");
            cur = cur.next;
        }
        res.append("NULL");
        System.out.println(res.toString());
    }



}
