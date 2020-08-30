package DataStructure.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int num = left; num <= right; num++) {
            if (dividingNumbers(num)) {
                res.add(num);
            }
        }
        return res;
    }

    public boolean dividingNumbers(int num) {
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (num % (c - '0' + 1) != 0) {
                return false;
            }
        }
        return true;
    }
}
