package Examination.tencent.internship2018;

import Examination.tencent.temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp1 = scanner.nextLine();
        int n = Integer.parseInt(temp1);
        String temp = scanner.nextLine();
        String[] strings = temp.trim().split(" ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(solve(n, A));

    }

    public static int solve(int n, int[] A) {
        sort(A, 0, A.length - 1);
        int sum = 0;
        for (int i = 0; i < n - 1; i = i + 2) {
            sum += (A[i] - A[i + 1]);
        }
        sum = -sum;
        if (n % 2 == 1) {
            sum += A[n - 1];
        }
        return sum;
    }

    public static void sort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        // base中存放基准数
        int base = arr[left];
        int i = left, j = right;
        while (i != j) {
            // 顺序很重要，先从右边开始往左找，直到找到比base值小的数
            while (arr[j] >= base && i < j) {
                j--;
            }
            // 再从左往右边找，直到找到比base值大的数
            while (arr[i] <= base && i < j) {
                i++;
            }
            // 上面的循环结束表示找到了位置或者(i>=j)了，交换两个数在数组中的位置
            if (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        // 将基准数放到中间的位置（基准数归位）
        arr[left] = arr[i];
        arr[i] = base;
        // 递归，继续向基准的左右两边执行和上面同样的操作
        // i的索引处为上面已确定好的基准值的位置，无需再处理
        sort(arr, left, i - 1);
        sort(arr, i + 1, right);
    }
}
