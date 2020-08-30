package Algorithm.Recurison;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */

public class FrogJumpStepII {
    public static int frogJumpStepII(int target) {
        int sum = 1;
        if (target == 0) {
            return 0;
        }
        for (int i = 1; i < target; i++) {
            sum = 2 * sum;
        }
        return sum;
    }
}
