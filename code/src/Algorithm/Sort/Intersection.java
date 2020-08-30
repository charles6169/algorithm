package Algorithm.Sort;

import DataStructure.Array.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：349. 两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集。
 */

//public class Intersection {
//    //    原创 未实现
//    public Integer[] intersection1(int[] nums1, int[] nums2) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        if (nums1.length >= nums2.length) {
//            list = getIntersection(nums2, nums1);
//        } else {
//            list = getIntersection(nums1, nums2);
//        }
//
////        列表类型转数组类型方法
//        Integer[] array = (Integer[]) list.toArray(new Integer[list.size()]);
//        return array;
//
//    }
//
//    public ArrayList<Integer> getIntersection(int[] littleNum, int[] bigNum) {
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        for (int i : littleNum) {
////            判断数组中是否有某元素
//            if (Arrays.asList(bigNum).contains(i)) {
//                arrayList.add(i);
//            }
//        }
//        return arrayList;
//    }
////    哈希表方法，用哈希表可以大幅度减少复杂度
//    public int[] intersection2(int[] nums1, int[] nums2) {
//        HashSet<Integer> set1 = new HashSet<Integer>();
//        for (Integer n : nums1) set1.add(n);
//        HashSet<Integer> set2 = new HashSet<Integer>();
//        for (Integer n : nums2) set2.add(n);
//
////        进行长度判断
//        if (set1.size() < set2.size()) return set_insersection(set1, set2);
//        else return set_insersection(set2, set1);
//    }
//
//    public int[] set_insersection(HashSet<Integer> set1, HashSet<Integer> set2) {
//        int[] output = new int[set1.size()];
//        int idx = 0;
//        for (Integer s : set1) {
//            if (set2.contains(s)) output[idx++] = s;
//        }
//        return Arrays.copyOf(output, idx);
//    }
//
//}
