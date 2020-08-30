package Examination.alibaba;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：魔塔问题
 */

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String l=in.nextLine();
        String[] line = l.split(" ");

        int[] A = new int[3];
        for (int i = 0; i < 3; i++) {
            A[i] = Integer.parseInt(line[i]);
        }
        int n = Integer.parseInt(line[line.length - 1]);
        int[][] nums = new int[n][3];
        for (int i = 0; i < n; i++) {
            String temp = in.nextLine();
            String[] strs = temp.trim().split(" ");
            nums[i][0] = Integer.parseInt(strs[0]);
            nums[i][1] = Integer.parseInt(strs[1]);
            nums[i][2] = Integer.parseInt(strs[2]);
        }


    }
}
