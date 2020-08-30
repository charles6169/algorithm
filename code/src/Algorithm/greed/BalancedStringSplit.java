package Algorithm.greed;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class BalancedStringSplit {
    public static int balancedStringSplit(String s) {
        int R = 0;
        int L = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                R++;
            } else {
                L++;
            }
            if (R == L) {
                res++;
                R = 0;
                L = 0;
            }
        }
        return res;
    }
}
