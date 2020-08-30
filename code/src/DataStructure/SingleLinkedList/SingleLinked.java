package DataStructure.SingleLinkedList;


import DataStructure.Tree.IsSymmetric;

import java.util.Arrays;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：LeetCode 算法组 链表
 */

public class SingleLinked {
    public static void main(String[] args) {
//        定义区
        int[] nums1 = {1, 2, 3, 3, 2, 1};
        int[] nums2 = {4, 5, 6};
        int[] nums3 = {1, 4, 3, 2, 5};
        int[] nums4 = {1, 2, 3, 4};
        ListNode l1 = SingleLinkedDemo.arrToList(nums1);
        ListNode l2 = SingleLinkedDemo.arrToList(nums2);
        ListNode l3 = SingleLinkedDemo.arrToList(nums3);
        ListNode l4 = SingleLinkedDemo.arrToList(nums4);
//        singleLinkedDemo.printListNode(l1);
//        singleLinkedDemo.printListNode(l2);
//        SingleLinkedDemo.printListNode(l3);
//        SingleLinkedDemo.printListNode(l4);

//        System.out.println(KthToLast.kthToLast(l4, 3));

        SingleLinkedDemo.addHeadNode(l4, 0);

    }
}



