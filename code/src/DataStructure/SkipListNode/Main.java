package DataStructure.SkipListNode;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Main {
    public static void main(String[] args) {
        SkipList<String> skipList = new SkipList<>();
        System.out.println(skipList);
        skipList.put(2, "yan");
        skipList.put(1, "co");
        skipList.put(3, "feng");
        skipList.put(1, "cao");//测试同一个key值
        skipList.put(4, "曹");
        skipList.put(6, "丰");
        skipList.put(5, "艳");
        System.out.println(skipList);
        System.out.println(skipList.size());
    }
}
