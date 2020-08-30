package DataStructure.Queue;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Queue {
    public static void main(String[] args) {
//        String[] arr = new String[10];
//
//        QueueDemo<Integer> queue = new QueueDemo<>();
//
//        for(int i = 0 ; i < 10 ; i ++){
//            queue.enqueue(i);//进队
//        }
//        System.out.println(queue);
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3001));
        System.out.println(recentCounter.ping(3002));

    }
}
