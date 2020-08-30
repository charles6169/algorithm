package Algorithm.Recurison;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：1137. 第 N 个泰波那契数
 * 泰波那契序列 Tn 定义如下： 
 * <p>
 * T0 = 0, T1 = 1, T2 = 1,
 * 且在 n >= 0 的条件下
 * Tn+3 = Tn + Tn+1 + Tn+2
 * <p>
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 */

public class Tribonacci {
    //    原创
    public static int tribonacci1(int n) {
//        终止条件
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
//            单级功能+返回值
            return tribonacci1(n - 1)
                    + tribonacci1(n - 2)
                    + tribonacci1(n - 3);
        }
    }

//    带记忆的递归   性能得到优化
    public static Tri t = new Tri();
    public static int tribonacci2(int n) {
        return t.nums[n];
    }

}

class Tri {
    private int n = 38;
    public int[] nums = new int[n];

    int helper(int k) {
        if (k == 0) return 0;
        if (nums[k] != 0) return nums[k];
        nums[k] = helper(k - 1) + helper(k - 2) + helper(k - 3);
        return nums[k];
    }

    Tri() {
        nums[1] = 1;
        nums[2] = 1;
        helper(n - 1);
    }
}