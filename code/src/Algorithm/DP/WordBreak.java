package Algorithm.DP;

import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                }
            }
        }
        return dp[len];

    }
}
