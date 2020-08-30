package Examination.bytedance.springexam2019;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String[] strs1 = string1.trim().split(" ");
        String string2 = scanner.nextLine();
        String[] strs2 = string2.trim().split(" ");

        int N = Integer.parseInt(strs1[0]);
        int D = Integer.parseInt(strs1[1]);
        int[] nums = new int[strs2.length];
        for (int i = 0; i < strs2.length; i++) {
            nums[i] = Integer.parseInt(strs2[i]);
        }

        System.out.println(solve(N, D, nums));
    }


    public static int solve(int N, int D, int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        Set<Integer> memory = new HashSet<>();

        dfs(D, N, 0, nums, memory, path, res);

        return res.size();

    }


    public static void dfs(int D, int N, int begin, int[] nums, Set<Integer> memory, Deque<Integer> path, List<List<Integer>> res) {
        if (path.size() == 3) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < N; i++) {
            if (path.size() != 0) {
                if (nums[i] - path.getFirst() > D) {
                    continue;
                }
            }

            if (!memory.contains(nums[i])) {
                memory.add(nums[i]);
                path.addLast(nums[i]);
                dfs(D, N, i + 1, nums, memory, path, res);
                path.removeLast();
                memory.remove(nums[i]);
            }
        }
    }


//    public static long solve(int D, int[] dist) {
//        long mod = 99997867;
//        long ans = 0;
//        for (int i = 0, j = 0; i < dist.length; i++) {
//            while (i >= 2 && (dist[i] - dist[j]) > D) {
//                j++;
//            }
//            ans += cal(i - j);
//        }
//        return ans % mod;
//
//    }
//
//    public static long cal(int n) {
//        return n * (n - 1) / 2;
//    }


}