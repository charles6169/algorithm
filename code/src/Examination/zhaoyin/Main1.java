package Examination.zhaoyin;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Main1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] data = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                data[i][j] = scanner.nextInt();
            }
        }


        int[][] dp = new int[N][N + 1];
        dp[0][0] = data[0][0];
        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) dp[i][j] = dp[i - 1][j] + data[i][j];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + data[i][j];
            }
        }

        int max = dp[N - 1][0];
        for (int i = 0; i < N + 1; i++) {
            if (dp[N - 1][i] > max)
                max = dp[N - 1][i];
        }

        System.out.print(max);


    }


//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int count = Integer.parseInt(in.nextLine());
//        int[][] nums = new int[count][count];
//        for (int i = 0; i < count; i++) {
//            String temp = in.nextLine();
//            String[] str = temp.trim().split(" ");
//            for (int j = 0; j < str.length; j++) {
//                nums[i][j] = Integer.parseInt(str[j]);
//            }
//        }
//        int row = 0;
//        int col = 0;
//        int sum = nums[row][col];
//        while (row < count - 2) {
//            int left = 0;
//            int right = 0;
//            row++;
//            if (col - 1 >= 0) {
//                left = nums[row][col - 1];
//            }
//            if (col + 1 <= row) {
//                right = nums[row][col + 1];
//            }
//            if (left > right) {
//                sum += left;
//                col -= 1;
//            } else {
//                sum += right;
//                col += 1;
//            }
//        }
//        System.out.println(sum);
//    }
}
