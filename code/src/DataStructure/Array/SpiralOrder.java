package DataStructure.Array;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题29. 顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 */

public class SpiralOrder {
//    l r t b 左右上下
    public int[] spiralOrder1(int[][] matrix) {
//        空值判定 注意二维矩阵判空方法
        if (matrix.length == 0) return new int[0];
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
//        注意新建的矩阵长度
        int[] res = new int[(r + 1) * (b + 1)];
        while (true) {
//            注意哪条边动，哪条边静止
            for (int i = 1; i <= r; i++) {
                res[x++] = matrix[t][i];
            }
//            结束条件是边界跨越，注意没有等号
            if (++t > b) break;
            for (int i = t; i <= b; i++) {
                res[x++] = matrix[i][r];
            }
            if (l > --r) break;
            for (int i = r; i >= 1; i--) {
                res[x++] = matrix[b][i];
            }
            if (t > --b) break;
            for (int i = b; i >= t; i--) {
                res[x++] = matrix[i][l];
            }
            if (++l > r) break;
        }
        return res;
    }
}
