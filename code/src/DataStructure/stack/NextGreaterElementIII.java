package DataStructure.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class NextGreaterElementIII {
    public static int nextGreaterElement(int n) {
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            while (!stack.isEmpty() && chars[i] > chars[stack.peek()]) {
                int temp = stack.pop();
                map.put(temp, i);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        boolean flag = false;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (map.get(i) != -1) {
                int val = map.get(i);
                swap(chars, i, val);


                flag = true;
            }
        }
        if (flag) {
            String re = new String(chars);
            return Integer.parseInt(re);
        } else {
            return -1;
        }
    }

    public static void swap(char[] chars, int val1, int val2) {
        char temp = chars[val1];
        chars[val1] = chars[val2];
        chars[val2] = temp;
    }
}
