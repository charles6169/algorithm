package Algorithm.DP;

import java.util.Scanner;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Holiday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] s2 = sc.nextLine().split(" ");
        String[] s3 = sc.nextLine().split(" ");
        int day = Integer.parseInt(s1);
        int[] works = new int[day+1];
        int[] gyms = new int[day+1];
        for (int i = 1; i < day+1; i++) {
            works[i] = Integer.parseInt(s2[i-1]);
            gyms[i] = Integer.parseInt(s3[i-1]);
        }
        int res = solve(day, works, gyms);
        System.out.println(res);
    }

    public static int solve(int day, int[] works, int[] gyms) {
        int res = 0;
        int[][] dp = new int[day + 1][3];
        dp[0][0] = dp[0][1] = dp[0][2] = 0;
        for (int i = 1; i < day+1; i++) {
            if (works[i] == 1) {
                dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2]) + 1;
            }
            if (gyms[i] == 1) {
                dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1]) + 1;
            }
            dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
        }
        res = day - Math.max(dp[day][0], Math.max(dp[day][1], dp[day][2]));
        return res;
    }

}
