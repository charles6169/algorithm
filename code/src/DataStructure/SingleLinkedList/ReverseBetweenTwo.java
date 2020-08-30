package DataStructure.SingleLinkedList;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：92. 反转链表 II
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 *
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 */

public class ReverseBetweenTwo {
    //    原创 未实现
    public ListNode reverseBetween1(ListNode head, int m, int n) {
        ListNode before_head = new ListNode(0);
        ListNode before = before_head;
        ListNode between_head = new ListNode(0);
        ListNode between = between_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;
        ListNode cur = head;
        int num = 1;
        while (cur.next != null) {
            if (num < m) {
                before.next = cur;
                before = cur;
            } else if (num >= m && num <= n) {
                cur.next = between_head;
                between_head = cur;
            } else {
                after.next = cur;
                after = cur;
            }
            num++;
            cur = cur.next;
        }
        before.next = between_head;
        between.next = after_head.next;
        after.next = null;
        return before_head.next;
    }

//    回溯法
    private boolean stop;
    private ListNode left;

    public ListNode reverseBetween2(ListNode head, int m, int n) {
        this.left = head;
        this.stop = false;
        this.recurseAndReverse(head, m, n);
        return head;
    }

    public void recurseAndReverse(ListNode right, int m, int n) {
        // base case. Don't proceed any further
        if (n == 1) {
            return;
        }

        // Keep moving the right pointer one step forward until (n == 1)
        right = right.next;

        // Keep moving left pointer to the right until we reach the proper node
        // from where the reversal is to start.
        if (m > 1) {
            this.left = this.left.next;
        }

        // Recurse with m and n reduced.
        this.recurseAndReverse(right, m - 1, n - 1);

        // In case both the pointers cross each other or become equal, we
        // stop i.e. don't swap data any further. We are done reversing at this
        // point.
        if (this.left == right || right.next == this.left) {
            this.stop = true;
        }

        // Until the boolean stop is false, swap data between the two pointers
        if (!this.stop) {
            int t = this.left.val;
            this.left.val = right.val;
            right.val = t;

            // Move left one step to the right.
            // The right pointer moves one step back via backtracking.
            this.left = this.left.next;
        }
    }
}
