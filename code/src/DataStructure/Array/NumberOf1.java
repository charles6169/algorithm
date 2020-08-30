package DataStructure.Array;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class NumberOf1 {
    public static int numberOf1(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }
}
