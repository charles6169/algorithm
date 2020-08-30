package Algorithm.DP;

import java.util.Scanner;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Bitcoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        int[] nums = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            nums[i] = Integer.parseInt(s1[i]);
        }


        int dp_i_0 = 0;
        int dp_i_1 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            dp_i_0 = Math.max(dp_i_0, dp_i_1 + nums[i]);
            dp_i_1 = Math.max(dp_i_1, -nums[i]);
        }
        System.out.println(dp_i_0);
    }
}
