package Algorithm.Recurison;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：青蛙跳台阶问题
 */

public class FrogJumpStep {

    public static int frogJumpStep1(int n) {
        if (n <= 2) {
            return n;
        }
        return frogJumpStep1(n - 1) + frogJumpStep1(n - 2);
    }

    public static int frogJumpStep2(int n) {
        int a = 1, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    public static int frogJumpStep3(int n) {
        int a = 1, b = 1;
        for (int i = 0; i < n; i++) {
            a = a + b;
            b = a - b;
        }
        return a;
    }


}
