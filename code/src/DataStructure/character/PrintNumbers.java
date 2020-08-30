package DataStructure.character;

import java.util.ArrayList;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class PrintNumbers {
    public static int[] printNumbers1(int n) {
        double m = Math.pow(10, n) - 1;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 1; i <= m; i++) {
            arrayList.add(i);
        }
        int[] arr=arrayList.stream().mapToInt(Integer::valueOf).toArray();
        return arr;
    }
}
