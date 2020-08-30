package DataStructure.stack;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class MyStack {
    public Queue<Integer> queue1;
    public Queue<Integer> queue2;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            queue1.offer(x);
            return;
        }
        if (queue1.isEmpty() && !queue2.isEmpty()) {
            queue1.offer(x);
            while (!queue2.isEmpty()) {
                queue1.offer(queue2.poll());
            }
        } else if (!queue1.isEmpty() && queue2.isEmpty()) {
            queue2.offer(x);
            while (!queue1.isEmpty()) {
                queue2.offer(queue1.poll());
            }
        } else {
            System.out.println("异常");
        }
        return;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        if (!queue1.isEmpty()) {
            return queue1.poll();
        } else if (!queue2.isEmpty()) {
            return queue2.poll();
        } else {
            return -1;
        }
    }

    /**
     * Get the top element.
     */
    public int top() {
        if (!queue1.isEmpty()) {
            return queue1.peek();
        } else if (!queue2.isEmpty()) {
            return queue2.peek();
        } else {
            return -1;
        }
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
