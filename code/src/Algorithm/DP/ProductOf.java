package Algorithm.DP;

import java.util.Scanner;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class ProductOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();

        int[] h = new int[n];
        for(int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
        }

        //dp[i][j] 表示前i个数字 使得为j 所需要的代价
        Integer[][] dp = new Integer[n+1][target + 1];

        int sum = 0;
        //前i个的值为1的dp值  作边界值
        for(int i = 1; i <= n; i++) {
            sum += h[i-1] - 1;
            dp[i][1] = sum;
        }

        //第1个数到target的dp值  作边界值
        for (int j = 1; j <= target; j++) {
            dp[1][j] = Math.abs(j - h[1-1]);
        }


        int result = doCheck(dp, n, target, h);

        System.out.println(result);

    }

    private static int doCheck(Integer[][] dp, int n, int target, int[] h) {
        //如果n,target已填，直接退出
        if (dp[n][target] != null) {
            return  dp[n][target];
        }

        //初始化min为极小值
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= target; i++) {
            // 找到target的因子i
            if (target % i != 0) {
                continue;
            }
            //计算余数
            int j = target / i;
            //递归计算
            min = Math.min(min, doCheck(dp, n-1, j, h) + Math.abs(h[n-1] - i));
        }

        return dp[n][target] = min;
    }
}
