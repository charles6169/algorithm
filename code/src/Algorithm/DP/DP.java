package Algorithm.DP;

import Visualization.DPVisual;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class DP {
    public static void main(String[] args) {
        int res = 0;
        int[][] arr = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        Integer[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        System.out.println(UniquePaths.uniquePaths1(7, 3));
//        System.out.println(MinPathSum.minPathSum1(arr));
//        System.out.println(ClimbStairs.climbStairs1(5));
//        System.out.println(MinCostClimbingStairs.minCostClimbingStairs1(cost));
//        System.out.println(MaxSubArray.maxSubArray(nums));
//        int[] arr1 = new int[]{1, 2, 3, 1};
//

//        System.out.println(Massage.massage(arr1));
        Boolean[] arr2 = {true, false, true, false};

//        System.out.println(NumSquares.numSquares(12));

//        IntegerBreak.integerBreak(10);
        DPVisual dpVisual = new DPVisual();
        int[] arr3 = {1, 1, 1, 1, 1};
//        CanPartition.canPartition(arr3);

//        dpVisual.drawDp(arr2);

//        dpVisual.drawDp2(ArrayDemo.toIntegerArray2(arr));
        String text1 = "aaa";
        String[] text2 = new String[]{"leet", "code"};
        List<String> text3 = new ArrayList<>();
        text3.add("leet");
        text3.add("code");
//        LongestCommonSubsequence.longestCommonSubsequence(text1, text2);

//        System.out.println(IsSubsequence.isSubsequence(text1, text2));

//        SuperEggDrop.superEggDrop(3,14);
//        System.out.println(FindTargetSumWays.findTargetSumWays(arr3, 3));

//        System.out.println(WordBreak.wordBreak(text1, text3));

//        System.out.println(CountSubstrings.countSubstrings(text1));
        int[] A = {1, 2, 3, 2, 1};
        int[] B = {1, 3, 5, 4, 2, 3, 4, 5};
//        System.out.println(FindLength.findLength(A, B));
//        System.out.println(FindLengthOfLCIS.findLengthOfLCIS(B));

//        System.out.println(JumpFloor.JumpFloor(1));

        System.out.println(CakeNumber.cakeNumber(4));
    }
}
