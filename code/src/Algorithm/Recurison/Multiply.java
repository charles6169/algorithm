package Algorithm.Recurison;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题 08.05. 递归乘法
 */

public class Multiply {
    public static int multiply1(int A, int B) {
        int max = Math.max(A, B);
        int min = Math.min(A, B);
        return helper(max, min);
    }

    public static int helper(int num, int times) {
//        终止
        if (times == 0) {
            return 0;
        }
//        单级+等价
        return num + helper(num, times - 1);
    }
}
