//package DataStructure.Tree;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * 创建人： 张秦
// * 创建时间：
// * 描述：
// */
//
//public class MaxDepth1 {
//    public int maxDepth(Node root) {
//        List<List<Integer>> res = new ArrayList<>();
//        if (root == null) {
//            return res.size();
//        }
//        recur();
//
//    }
//
//    public void recur(Node root, int level, List<List<Integer>> res) {
//        if (root == null) {
//            return;
//        }
//        if (res.size() < level) {
//            res.add(new ArrayList<>());
//        }
//        int s = root.children.size();
//        for (int i = 0; i < s; i++) {
//            res.get(level).add(root.children.get(i).val);
//        }
//        recur(root.)
//
//    }
//
//}
