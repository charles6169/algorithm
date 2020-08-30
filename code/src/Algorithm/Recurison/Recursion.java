package Algorithm.Recurison;

import DataStructure.Tree.TreeDemo;
import DataStructure.Tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Recursion {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 2, 6};
        Integer[] nums1 = {5, 4, 5, 1, 1, null, 5};
        Integer[] nums2 = {4, 2, 6, 1, 3, null, null};

        int[] nums3 = {2, 1, 0};
        List<Integer> listA = Arrays.stream(nums3).boxed().collect(Collectors.toList());
        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();
        TreeNode root1 = TreeDemo.constructTree(nums1);
        TreeNode root2 = TreeDemo.constructTree(nums2);

//        TreeDemo.show(root1);
//        System.out.println(Fibonacci.fibonacci2(10));
//        System.out.println(CanPartitionKSubsets.canPartitionKSubsets1(nums, 4));
//        System.out.println(FrogJumpStep.frogJumpStep2(10));
//        System.out.println(AddDigits.addDigits1(25726));
//        System.out.println(Multiply.multiply1(3, 4));
//        System.out.println(LongestUnivaluePath.longestUnivaluePath1(root1));
//        System.out.println(MinDiffInBST.minDiffInBST2(root2));
//        System.out.println(Tribonacci.tribonacci2(34));
//        Hanota.hanota1(listA, listB, listC);
//        System.out.println(listA);
//        System.out.println(listB);
//        System.out.println(listC);
//        System.out.println(Arrays.toString(DivingBoard.divingBoard1(1, 2, 0)));
//        FrogJumpStep.frogJumpStep3(5);
        FrogJumpStepII.frogJumpStepII(6);



    }
}
