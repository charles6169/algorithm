package Algorithm.Search;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class SearchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int c = n;
        while (r < m && c > 0) {
            int temp = matrix[r][c - 1];
            if (temp == target) {
                return true;
            } else if (temp > target) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }
}
