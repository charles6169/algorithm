package DataStructure.Queue;

import com.sun.jmx.remote.internal.ArrayQueue;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：数组队列类
 */

public class QueueDemo<E> {
    //使用自定义的动态数组类作为存储元素的容器
    private QueueArray<E> array;
    //如果可以大致知道队列要存储的元素个数，可以给定数值来初始化
    public QueueDemo(int capacity){
        array = new QueueArray<>(capacity);
    }
    //如果不知道，调用Array类的默认构造函数，默认是10个元素
    public QueueDemo(){
        array = new QueueArray<>();
    }


    public int getSize(){
        return array.getSize();
    }


    public boolean isEmpty(){
        return array.isEmpty();
    }

    public int getCapacity(){
        return array.getCapacity();
    }


    public void enqueue(E e){
        array.addLast(e);
    }


    public E dequeue(){
        //时间复杂度是O(N),因为队首元素出去后，
        // 后面的元素要向前进一步
        //如果使用循环队列，可以达到O(1)的复杂度
        return array.removeFirst();
    }


    public E getFront(){
        return array.getFirst();
    }

    //自定义输出格式
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for(int i = 0 ; i < array.getSize() ; i ++){
            res.append(array.get(i));
            if(i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }


}
