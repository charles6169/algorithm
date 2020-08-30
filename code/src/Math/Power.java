package Math;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Power {
    public static double power(double base, int exponent) {
        if (base == 0.0) {
            return 0.0;
        }
        double result = 1.0;
        int e = exponent > 0 ? exponent : -exponent;
        for (int i = 1; i <= e; i++) {
            result *= base;
        }
//        如果指数是负的，那么应该返回分数
        return exponent > 0 ? result : 1 / result;
    }
}
