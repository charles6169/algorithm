package DataStructure.stack;

import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */
//辅助栈和数据栈同步方法
public class MinStack {
    private Stack<Integer> data;
    private Stack<Integer> helper;

    public MinStack() {
        data = new Stack<Integer>();
        helper = new Stack<Integer>();
    }

    public void push(int x) {
        data.add(x);
        if (helper.isEmpty() || helper.peek() >= x) {
            helper.add(x);
        } else {
            helper.add(helper.peek());
        }
    }

    public void pop() {
        if (!data.isEmpty()) {
            helper.pop();
            data.pop();
        }
    }

    public int top() {
        if (!data.isEmpty()) {
            return data.peek();
        }
        throw new RuntimeException("栈中元素为空");
    }

    public int getMin() {
        if (!helper.isEmpty()) {
            return helper.peek();
        }
        throw new RuntimeException("栈中元素为空");
    }

}
