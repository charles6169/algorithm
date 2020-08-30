package Algorithm.DP;

import DataStructure.Array.ArrayDemo;
import Visualization.DPVisual;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class CountSubstrings {
    public static int countSubstrings(String s) {
        int len = s.length();
        int[][] dp = new int[len + 1][len + 1];
        dp[0][0] = 0;
        for (int i = 0; i <= len; i++) {
            dp[i][0] = 1;
            dp[0][i] = 1;
        }
        DPVisual dpVisual=new DPVisual();
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <=i; j++) {
                if (check(s.substring(j, i))) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                dpVisual.drawDp2(ArrayDemo.toIntegerArray2(dp));
            }
        }
        return dp[len][len];

    }


    public static boolean check(String s1) {
        char[] chars = s1.toCharArray();
        if (chars.length == 1) {
            return true;
        }
        int l = 0;
        int r = chars.length - 1;
        while (l < r) {
            if (chars[l] != chars[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
