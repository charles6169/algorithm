package DataStructure.SingleLinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class GetDecimalValue {
    public static int getDecimalValue1(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        int sum = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            sum += Math.pow(2, i) * list.get(list.size() - i - 1);
        }
        return sum;
    }
}
