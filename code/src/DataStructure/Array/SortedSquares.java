package DataStructure.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class SortedSquares {
    public static int[] sortedSquares1(int[] A) {
        List<Integer> list = new ArrayList<>();
        for (int i : A) {
            list.add((int) Math.pow(i, 2));
        }
        int[] res = list.stream().mapToInt(Integer::valueOf).toArray();
        Arrays.sort(res);
        return res;

    }
}
