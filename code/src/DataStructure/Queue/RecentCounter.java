package DataStructure.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：933. 最近的请求次数
 * 写一个 RecentCounter 类来计算最近的请求。
 */

public class RecentCounter {
    static Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<Integer>();
    }

    public static int ping(int t) {
        queue.add(t);
        while(queue.peek()<t-3000)
            queue.poll();
        return queue.size();
    }
}
/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */