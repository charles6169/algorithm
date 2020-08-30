package DataStructure.Map;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：706. 设计哈希映射
 */

public class MyHashMap {
    /**
     * Initialize your data structure here.
     * 分别用keys和values存放键和值的信息
     * 其中又各为链表
     */
    List<List<Integer>> keys;
    List<List<Integer>> values;
    int Base = 500;//桶的个数 base 基数

    public MyHashMap() {
        keys = new ArrayList<List<Integer>>();
        values = new ArrayList<List<Integer>>();
        for (int i = 0; i < Base; i++) {
            keys.add(i, new ArrayList<Integer>());
            values.add(i, new ArrayList<Integer>());
        }
    }

    /**
     * value will always be non-negative.
     * 先判断keys中是否有对应的key：
     * 如果没有，则存入键和值的信息于（key % Base）位置
     * 如果有，则先删除原有信息再存入
     */
    public void put(int key, int value) {
        if (!contains(key)) {
//            key % Base即为哈希函数计算过程
            keys.get(key % Base).add(key);
            values.get(key % Base).add(value);
        } else {
            remove(key);
            keys.get(key % Base).add(key);
            values.get(key % Base).add(value);
        }
    }

    /**
     * Returns the value to which the specified key is mapped,
     * or -1 if this map contains no mapping for the key
     * 先判断keys中是否有对应的key：
     * 如果有，则先从keys的指定位置获取index，即（key % Base）位置
     * 再从values中获取值，values.get(key % Base).get(index);
     * 如果没有，返回 -1
     */
    public int get(int key) {
        if (contains(key)) {
            int index = keys.get(key % Base).indexOf((Integer) key);
            return values.get(key % Base).get(index);
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     * 先判断keys中是否有对应的key：
     * 如果有，则先从keys的指定位置获取index，即（key % Base）位置，再删除
     */
    public void remove(int key) {
        if (contains(key)) {
            int index = keys.get(key % Base).indexOf((Integer) key);
            keys.get(key % Base).remove(index);
            values.get(key % Base).remove(index);
        }
    }

//    判断keys中是否有key
    public boolean contains(int key) {
        return keys.get(key % Base).contains(key);
    }
}
