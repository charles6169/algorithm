package Algorithm.Sort;

import java.util.Arrays;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：976. 三角形的最大周长
 * 给定由一些正数（代表长度）组成的数组 A，
 * 返回由其中三个长度组成的、面积不为零的三角形的最大周长。
 * <p>
 * 如果不能形成任何面积不为零的三角形，返回 0。
 */

public class Sort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, -1, 5, 3, 8};
        int[] nums1 = {0, 1, 2, 1};
        int[] nums2 = {2, 2};
        String s = "anagram";
        String t = "nagaram";

//        System.out.println(Arrays.toString(GetLeastNumbers.getLeastNumbers1(nums1, 1)));
//        System.out.println(Arrays.toString(SortDemo.bubbleSort(arr)));
//        System.out.println(Arrays.toString(SortDemo.insertSort(arr)));
//        System.out.println(Arrays.toString(SortDemo.quickSort(arr)));

//        System.out.println(Arrays.toString(SortDemo.shellSort(arr)));
        System.out.println(Arrays.toString(SortDemo.heapSort(arr)));

    }
}
