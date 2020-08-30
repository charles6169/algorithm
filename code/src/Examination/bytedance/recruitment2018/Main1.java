package Examination.bytedance.recruitment2018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] nums1 = new int[n];
        String temp1 = scanner.nextLine();
        String[] strings = temp1.trim().split(" ");
        for (int i = 0; i < n; i++) {
            nums1[i] = Integer.parseInt(strings[i]);
        }
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] strings1 = new String[m];
        for (int i = 0; i < m; i++) {
            strings1[i] = scanner.nextLine();
        }
        int[][] nums2 = new int[m][3];
        for (int i = 0; i < m; i++) {
            String[] strings2 = strings1[i].trim().split(" ");
            nums2[i][0] = Integer.parseInt(strings2[0]);
            nums2[i][1] = Integer.parseInt(strings2[1]);
            nums2[i][2] = Integer.parseInt(strings2[2]);
        }
//        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            int res = 0;
            for (int j = 0; j < nums1.length; j++) {

                if (nums1[j] >= nums2[i][0] && nums1[j] <= nums2[i][1] && nums1[j] == nums2[i][2]) {
                    res++;

                }

            }
            System.out.println(res);
        }
//        System.out.println(res);

    }


}
