package Algorithm.DFS;

import DataStructure.Array.ArrayDemo;
import Visualization.DPVisual;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class HasPath {
    static DPVisual dpVisual = new DPVisual();

    public static boolean hasPath(char[][] matrix, int rows, int cols, char[] str) {
        if (str.length == 0) {
            return false;
        }
        int len = str.length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(matrix, i, j, 0, str)) {
                    return true;
                }
            }
        }
        return false;

    }

    public static boolean dfs(char[][] matrix, int r, int c, int pos, char[] str) {
        if (r < 0 || r >= matrix.length || c < 0 || c >= matrix[0].length || matrix[r][c] != str[pos]) {
            return false;
        }
        if (pos == str.length-1) {
            return true;
        }
        char temp = matrix[r][c];
        matrix[r][c] = '/';
        dpVisual.drawDp2(ArrayDemo.toCharacterArray2(matrix));
        boolean a = dfs(matrix, r + 1, c, pos + 1, str);
        boolean b = dfs(matrix, r - 1, c, pos + 1, str);
        boolean d = dfs(matrix, r, c + 1, pos + 1, str);
        boolean e = dfs(matrix, r, c - 1, pos + 1, str);
        matrix[r][c] = temp;
        boolean res=a || b || d || e;

        return res;
    }

}
