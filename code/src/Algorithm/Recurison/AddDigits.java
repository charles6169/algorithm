package Algorithm.Recurison;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：258. 各位相加
 * 给定一个非负整数 num，
 * 反复将各个位上的数字相加，直到结果为一位数。
 */

public class AddDigits {
    public static int addDigits1(int num) {
        String str = String.valueOf(num);
//        终止条件
        if (str.length() == 1) {
            return num;
        }
//        单级功能
        int sum = 0;
        for (int i = 0; i <= str.length()- 1; i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
//        等价关系
        return addDigits1(sum);
    }
}
