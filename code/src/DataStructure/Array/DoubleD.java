package DataStructure.Array;

import java.util.Scanner;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class DoubleD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] nums = new int[n][4];

        for (int i = 0; i < n; i++) {
            String[] s1 = sc.nextLine().split(" ");
            for (int j = 0; j < 4; j++) {
                nums[i][j] = Integer.parseInt(s1[j]);
            }
        }
        solve(n,nums);

    }

    public static void solve(int n, int[][] nums) {
        int A = 0;
        int B = 0;
        int p = 0;
        int q = 0;
        for (int i = 0; i < n; i++) {
            A = nums[i][0];
            B = nums[i][1];
            p = nums[i][2];
            q = nums[i][3];
            int res = 0;
            while (A < B) {
                A += p;
                p *= q;
                res++;
            }
            System.out.println(res);

        }
    }
}
