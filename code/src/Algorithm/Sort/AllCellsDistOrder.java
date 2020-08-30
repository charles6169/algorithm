package Algorithm.Sort;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：1030. 距离顺序排列矩阵单元格
 * 给出 R 行 C 列的矩阵，其中的单元格的整数坐标为 (r, c)，
 * 满足 0 <= r < R 且 0 <= c < C。
 *
 * 另外，我们在该矩阵中给出了一个坐标为 (r0, c0) 的单元格。
 *
 * 返回矩阵中的所有单元格的坐标，
 * 并按到 (r0, c0) 的距离从最小到最大的顺序排，
 * 其中，两单元格(r1, c1) 和 (r2, c2) 之间的距离是曼哈顿距离，
 * |r1 - r2| + |c1 - c2|。（你可以按任何满足此条件的顺序返回答案。）
 *

 */

public class AllCellsDistOrder {
    public int[][] allCellsDistOrder1(int R, int C, int r0, int c0) {
        int[] l = new int[4];
        l[0] = r0 + c0;
        l[1] = r0 + C - 1 - c0;
        l[2] = R - 1 - r0 + c0;
        l[3] = R - 1 - r0 + C - 1 - c0;
        int m = 0;
        for (int i : l) {
            if (i > m) {
                m = i;
            }
        }

        int[][] ref = new int[R * C][2];
        int idx = 1;
        ref[0][0] = r0;
        ref[0][1] = c0;
        for (int i = 1; i <= m; i++) {
            for (int x = 0; x <= i; x++) {
                if (r0 - x >= 0 && c0 - (i - x) >= 0) {
                    ref[idx][0] = r0 - x;
                    ref[idx++][1] = c0 - (i - x);
                }
                if (r0 + x <= R - 1 && c0 - (i - x) >= 0 && x != 0 && i != x) {
                    ref[idx][0] = r0 + x;
                    ref[idx++][1] = c0 - (i - x);

                }
                if (r0 - x >= 0 && c0 + (i - x) <= C - 1 && x != 0 && i != x) {
                    ref[idx][0] = r0 - x;
                    ref[idx++][1] = c0 + (i - x);

                }
                if (r0 + x <= R - 1 && c0 + (i - x) <= C - 1) {
                    ref[idx][0] = r0 + x;
                    ref[idx++][1] = c0 + (i - x);

                }
            }
        }
        return ref;
    }
}
