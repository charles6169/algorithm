package Examination.bytedance.springexam2019;

import Algorithm.DP.DP;
import DataStructure.Array.Array;
import DataStructure.Array.ArrayDemo;
import Visualization.DPVisual;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int N = Integer.parseInt(string);
        int[] nums = {1, 4, 16, 64};

        int res = solve(1024 - N, nums);
        System.out.println(res);
    }


    public static int solve(int N, int[] nums) {
        int max = N + 1;
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - nums[j]] + 1);
                }
            }
        }

        return dp[N] > N ? -1 : dp[N];
    }
}
