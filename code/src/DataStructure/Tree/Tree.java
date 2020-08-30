package DataStructure.Tree;

import DataStructure.SingleLinkedList.ListNode;
import DataStructure.SingleLinkedList.SingleLinkedDemo;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Tree {
    public static void main(String[] args) {
        Integer[] nums1 = {0,-1};
        Integer[] nums2 = {1};
        Integer[] nums3 = {3, 9, 20, null, null, 15, 7};
        int[] nums4 = {3, 9, 20, 15, 7};
        int[] nums5 = {9, 3, 15, 20, 7};
//        建树方法是由上而下，二维数组方式，第一行一个，第二行两个，第三行四个
        TreeNode root1 = TreeDemo.constructTree(nums1);
        TreeNode root2 = TreeDemo.constructTree(nums2);
        TreeNode root3 = TreeDemo.constructTree(nums3);
//        TreeDemo.show(root1);

//        TreeDemo.show(BuildTree.buildTree1(nums4, nums5));
//        System.out.println(RangeSumBST.rangeSumBST1(root2, 7, 15));
//        System.out.println(LevelOrderBottom.levelOrderBottom2(root2));
//        TreeDemo.show(InvertTree.invertTree1(root2));
//        System.out.println(FindTilt.findTilt1(root3));
//        System.out.println(TreeDemo.preOrder3(root3).toString());
//        WidthOfBinaryTree.widthOfBinaryTree(root1);


//        System.out.println(SumOfLeftLeaves.sumOfLeftLeaves(root2));

//        System.out.println(WidthOfBinaryTree.widthOfBinaryTree(root3));
//        System.out.println(ZigzagLevelOrder.zigzagLevelOrder(root3));
//        System.out.println(PathSum.pathSum(root1, 22));

//        System.out.println(DeepestLeavesSum.deepestLeavesSum(root1));

//        System.out.println(SumEvenGrandparent.sumEvenGrandparent(root1));
        int[] numsL = {-10, -3, 0, 5, 9};

//        ListNode l1 = SingleLinkedDemo.arrToList(numsL);

//        SortedListToBST.sortedListToBST(l1);
//        System.out.println(FindBottomLeftValue.findBottomLeftValue(root1));
//        System.out.println(GoodNodes.goodNodes(root1));

        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
//        TreeDemo.show(BuildTree1.buildTree(inorder, postorder));

//        System.out.println(SumNumbers.sumNumbers(root1));

//        System.out.println(RightSideView.rightSideView(root1));

//        System.out.println(MaxAncestorDiff.maxAncestorDiff(root1));

//        System.out.println(LargestValues.largestValues(root1));


//        System.out.println(DistanceK.distanceK(root1, 5,2));

    }
}
