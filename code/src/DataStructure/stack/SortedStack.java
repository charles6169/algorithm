package DataStructure;

import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题 03.05. 栈排序
 * 栈排序。 编写程序，对栈进行排序使最小元素位于栈顶。
 */

public class SortedStack {
    public Stack<Integer> stack1;
    public Stack<Integer> stack2;

    public SortedStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int val) {
        if (stack1.isEmpty()) {
            stack1.push(val);
            return;
        }
        while (!stack1.isEmpty()) {
            if (val >= stack1.peek()) {
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
                stack2.push(val);
            } else {
                stack2.push(val);
                val = stack1.pop();
            }
        }
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public void pop() {
        try {
            if(!stack1.isEmpty()){
                stack1.pop();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int peek() {
        return !stack1.isEmpty() ? stack1.peek() : -1;
    }

    public boolean isEmpty() {
        return !stack1.isEmpty() ? true : false;
    }
}
