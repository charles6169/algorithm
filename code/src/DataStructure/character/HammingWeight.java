package DataStructure.character;

import java.math.BigInteger;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class HammingWeight {
    public static int hammingWeight1(int n) {
        int m = 0;
        String s = decimalToBinary(n);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1') {
                m++;
            }
        }
        return m;
    }

    //    十进制转二进制的方法
    public static String decimalToBinary(int decimal) {
        BigInteger n = new BigInteger(String.valueOf(decimal));
        return n.toString(2); //参数2指定的是转化成X进制，默认10进制
    }
}
