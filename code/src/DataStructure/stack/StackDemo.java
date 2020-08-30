package DataStructure.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class StackDemo {
    java.util.Stack<Integer> stack;
    //    辅助栈
    java.util.Stack<Integer> stackTemp;

    /**
     * initialize your data structure here.
     */
    public StackDemo() {
        stack = new java.util.Stack<>();
        stackTemp = new java.util.Stack<>();

    }

    public void push(int x) {
        stack.push(x);
    }

    public void pop() {
        if (!stack.isEmpty()) stack.pop();
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            return -1;
        }
    }

    public boolean isEmpty() {
        return !stack.isEmpty() ? true : false;
    }

    //    获取栈的最小元素
    public int getMin() {
        int temp = stack.pop();
        while (!stack.isEmpty()) {
            if (temp <= stack.peek()) {
                stackTemp.push(stack.pop());
            } else {
                stackTemp.push(temp);
                temp = stack.pop();
            }
        }
        stackTemp.push(temp);
        while (!stackTemp.isEmpty()) {
            stack.push(stackTemp.pop());
        }
        return temp;
    }

    //    数组转栈
    public java.util.Stack arrayToStack(int[] nums) {
        for (int i : nums) {
            stack.push(i);
        }
        return stack;
    }

    //    输出栈
    public void show(Stack<Integer> stack) {
        List<Integer> list = new ArrayList<>();
        for (int i : stack) {
            list.add(i);
        }
        System.out.println(list);
    }
}
