package Algorithm.Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Search {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 3, 5, 7, 7, 7, 7, 8, 14, 14};
        int[] nums2 = {1, 3, 5, 6};
        int[] nums3 = {0, 0, 1, 1, 5, 6, 7, 9, 11, 15};

        int[] nums4 = {1, 2, 2, 1};
        int[] nums5 = {2, 2};
        int[][] nums6 = {{4, 0, 0, -1}, {3, 2, 0, -1}, {0, 0, -1, -2}, {1, 1, 0, -2}};
        int[][] nums7 = {{1}};
//        System.out.println(MinArray.minArray2(nums2));
//        System.out.println(MissingNumber.missingNumber1(nums3));
//        System.out.println(SearchDemo.binSearch(nums3, 1));
//        System.out.println(SearchBinaryDemo.searchInsert2(nums2, -1));
//        System.out.println(Arrays.asList(Intersection.intersection(nums4, nums5)));

//        System.out.println(SearchMatrix.searchMatrix(nums6, 1));
//        int[][] nums8 = {{3, 2}, {1, 0}};
//        System.out.println(CountNegatives.countNegatives(nums6));

        int[] nums8 = new int[]{4, 3, 1, 0, 0, 0, 0, 0, 0, 0, -2, -4};
        System.out.println(SearchDemo.binaryLeftSearch(nums8, 0));
        System.out.println(SearchDemo.binaryRightSearch(nums8, 0));


    }
}
