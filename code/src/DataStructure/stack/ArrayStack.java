package DataStructure.stack;

import java.util.Arrays;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：数组栈
 */

public class ArrayStack<T> {
    private Object[] stack;
    private int size;

    public ArrayStack() {
        stack = new Object[10];
    }

    //    判空
    public boolean isEmpty() {
        return size == 0;
    }

    //    当容量大于默认的10的时候，扩大容量
    public void expandCapacity(int size) {
        int len = stack.length;
        if (size > len) {
            size = size * 3 / 2 + 1;
            stack = Arrays.copyOf(stack, size);
        }
    }

    //    返回最上层元素但不弹出
    public T peek() {
        T t = null;
        if (size > 0) {
            t = (T) stack[size - 1];
        }
        return t;
    }

    //    入栈
    public void push(T t) {
        expandCapacity(size + 1);
        stack[size] = t;
        size++;
    }

    //    出栈
    public T pop() {
        T t = peek();
        if (size > 0) {
            stack[size - 1] = null;
            size--;
        }
        return t;
    }

    public int getSize() {
        return size;
    }



}
