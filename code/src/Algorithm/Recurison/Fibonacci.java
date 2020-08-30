package Algorithm.Recurison;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：斐波拉契数列
 */

public class Fibonacci {

    public static int fibonacci1(int n) {
//        终止
        if (n < 2) {
            return 1;
        }
//        单级＋等价
        return fibonacci1(n - 1) + fibonacci1(n - 2);
    }

    //    动态规划法
    public static int fibonacci2(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

}
