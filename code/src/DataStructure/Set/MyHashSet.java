package DataStructure.Set;

import java.util.LinkedList;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：705. 设计哈希集合
 */

public class MyHashSet {
    public Bucket[] bucketArray;
    public int Base;

    /**
     * Initialize your data structure here.
     * 基数设置为质数 769
     */
    public MyHashSet() {
        this.Base = 769;
        this.bucketArray = new Bucket[this.Base];
        for (int i = 0; i < this.Base; ++i) {
            this.bucketArray[i] = new Bucket();
        }
    }

//    哈希函数
    public int _hash(int key) {
        return (key % this.Base);
    }

//    先计算哈希索引,再在bucketIndex位置插入
    public void add(int key) {
        int bucketIndex = this._hash((key));
        this.bucketArray[bucketIndex].insert(key);
    }

//    先计算哈希索引,再在bucketIndex位置删除
    public void remove(int key) {
        int bucketIndex = this._hash(key);
        this.bucketArray[bucketIndex].delete(key);
    }

    /**
     * Returns true if this set contains the specified element
     * 判断bucketArray中是否存在指定key
     */
    public boolean contains(int key) {
        int bucketIndex = this._hash(key);
        return this.bucketArray[bucketIndex].exists(key);
    }
}

//辅助 桶类
class Bucket {
    public LinkedList<Integer> container;

    public Bucket() {
        container = new LinkedList<Integer>();
    }

    public void insert(Integer key) {
//        方法返回在此列表中指定元素的第一个匹配项的索引，
//        或者-1，如果此列表中不包含该元素。
        int index = this.container.indexOf(key);
        if (index == -1) {
//            如果不存在，则用头插法插入
            this.container.addFirst(key);
        }
    }

    public void delete(Integer key) {
        this.container.remove(key);
    }

    public boolean exists(Integer key) {
        int index = this.container.indexOf(key);
        return (index != -1);
    }
}
