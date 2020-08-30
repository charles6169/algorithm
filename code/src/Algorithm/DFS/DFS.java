package Algorithm.DFS;

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

public class DFS {
    public static void main(String[] args) {
        Integer[] nums1 = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1};
        String beginWord = "hit";
        String endWord = "cog";
        String[] arr = {"hot", "dot", "dog", "lot", "log", "cog"};
        List<String> wordList = new ArrayList<>();
        for (String s : arr) {
            wordList.add(s);
        }
        Integer[] nums2 = {3, 5, 1, 6, 2, 9, 8, null, null, 7, 4, null, null, null, null};
        Integer[] nums3 = {3, 5, 1, 6, 2, 9, 8, null, null, 7, 4, null, null, null, 1};
        Integer[] nums4 = {5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9};
        TreeNode root1 = TreeDemo.constructTree(nums2);
        TreeNode root2 = TreeDemo.constructTree(nums3);
        TreeNode root3 = TreeDemo.constructTree(nums4);

        int[] nums = {-10, -3, 0, 5, 9};
        int[] nums5 = {1, 2, 3};
        int[] nums6 = {4, 2, 1};
        int target = 32;

        char[][] matrix = new char[][]{
                {
                        'a', 'b', 'c', 'e'
                }, {
                's', 'f', 'c', 's'
        }, {
                'a', 'd', 'e', 'e'
        }
        };
//        CombinationSum.combinationSum(nums5, 7);
//        Permute.permute(nums5);

//        PermuteUnique.permuteUnique(nums5);
//        String s1="23";
//        LetterCombinations.letterCombinations(s1);
//        System.out.println(GetPermutation.getPermutation(3, 3));

//        Combine.combine(4,2);
//        Subsets.subsets(nums5);
//        SubsetsWithDup.subsetsWithDup(nums5);
        String s1 = "a1b2";
//        LetterCasePermutation.letterCasePermutation(s1);


//        System.out.println(CombinationSum4.combinationSum4(nums6, 32));
        String s = "qqe";
//        System.out.println(HasPath.hasPath(matrix, matrix.length, matrix[0].length, s.toCharArray()));

//        System.out.println(Permutation.permutation(s));


//        System.out.println(NumTilePossibilities.numTilePossibilities(s));

        System.out.println(Permutation1.permutation(s));

    }
}
