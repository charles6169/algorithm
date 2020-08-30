package DataStructure.stack;

import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：232. 用栈实现队列
 */

public class MyQueue {
    java.util.Stack<Integer> stack1;
    java.util.Stack<Integer> stack2;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack1 = new java.util.Stack<>();
        stack2 = new Stack<>();

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        if (stack1.isEmpty()) {
            stack1.push(x);
        } else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(x);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (!stack1.isEmpty()) {
            return stack1.pop();
        } else {
            return -1;
        }
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (!stack1.isEmpty()) {
            return stack1.peek();
        } else {
            return -1;
        }
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        if (stack1.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
