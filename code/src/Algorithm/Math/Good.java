package Algorithm.Math;

import java.util.Scanner;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Good {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (recur(i, false)) res++;
        }
        System.out.println(res);

    }

    public static boolean recur(int n, boolean flag) {
        if (n == 0) return flag;
        int d = n % 10;
        if (d == 3 || d == 4 || d == 7) {
            return false;
        }
        if (d == 0 || d == 1 || d == 8) {
            return recur(n / 10, flag);
        }
        return recur(n / 10, true);
    }
}
