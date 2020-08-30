package Examination.alibaba;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：骰子问题
 */

public class Main {
    int[][] res;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());
        int n = Integer.parseInt(in.nextLine());
        char[][] nums = new char[n][n];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < n; j++) {
                String temp=in.nextLine();
                for (int k = 0; k < n; k++) {
                    nums[j][k]=temp.charAt(k);
                }
            }
        }




    }
    public void dfs(int[][] nums){

    }


}
