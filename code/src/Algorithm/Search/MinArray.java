package Algorithm.Search;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题11. 旋转数组的最小数字
 * 二分法
 */

public class MinArray {
    private int[] numbers;

    public static int minArray1(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) {
                i = m + 1;
            } else if (numbers[m] < numbers[j]) {
                j = m;
            } else {
                j--;
            }
        }
        return numbers[i];
    }

    public static int minArray2(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }



}
