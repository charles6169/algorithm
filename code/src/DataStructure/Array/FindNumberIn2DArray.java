package DataStructure.Array;

import java.util.HashSet;
import java.util.Set;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class FindNumberIn2DArray {
    public static boolean findNumberIn2DArray1(int[][] matrix, int target) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(target);
        for (int i = 0; i < matrix[0].length - 1; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (!set.add(matrix[i][j])) return true;
            }
        }
        return false;
    }

//    线性查找
    public static boolean findNumberIn2DArray2(int[][] matrix, int target) {
//        注意判决条件
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int row = 0, column = columns - 1;
//        注意条件 ，row没有等号
        while (row < rows && column >= 0) {
            int num = matrix[row][column];
            if (num == target) {
                return true;
//                大于则左移
            } else if (num > target) {
                column--;
//                小于则右移
            } else {
                row++;
            }
        }
        return false;
    }
}
