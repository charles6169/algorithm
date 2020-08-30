import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题09. 用两个栈实现队列
 * 用两个栈实现一个队列。队列的声明如下，
 * 请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。
 * (若队列中没有元素，deleteHead 操作返回 -1 )
 */

//操作方法
//    为了维护队列的特性，每次插入的元素应该在第一个栈的底部。
//    因此每次插入元素时，若第一个栈内已经有元素，
//    应将已有的全部元素依次弹出并压入第二个栈，
//    然后将新元素压入第一个栈，最后将第二个栈内的全部元素依次弹出并压入第一个栈。


public class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int size;

    public CQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
        size = 0;
    }

    public void appendTail(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        size++;
    }

    public int deleteHead() {
        if (size == 0) {
            return -1;
        }
        size--;
        return stack1.pop();
    }
}
