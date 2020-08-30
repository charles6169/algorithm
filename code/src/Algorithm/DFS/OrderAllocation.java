//package Algorithm.DFS;
//
//import java.util.*;
//
///**
// * 创建人： 张秦
// * 创建时间：
// * 描述：
// */
//
//public class OrderAllocation {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//
//
//        }
//
//
//    }
//
//
//    public static void solve(int n, double[][] nums) {
//        double res = 0.0;
//        List<List<Double>> list = new ArrayList<>();
//        Deque<Double> deque = new ArrayDeque<>();
//        Set<Integer> memory = new HashSet<>();
//        dfs();
//
//    }
//
//    static int maxIndex = 0;
//
//    public static void dfs(int n, int begin, int max, double[][] nums, Set<Integer> memory, Deque<Double> deque, List<List<Double>> list) {
//        if (deque.size() == n) {
//            list.add(new ArrayList<>(deque));
//            double sum = 0;
//            for (double i : deque) {
//                sum += i;
//            }
//            if (sum > max) {
//                maxIndex = list.size() - 1;
//            }
//        }
//
//        for (int i = begin; i < n; i++) {
//            if (!memory.contains(i)) {
//                memory.add(i);
//                deque.addLast(nums);
//            }
//
//        }
//
//
//    }
//
//}
