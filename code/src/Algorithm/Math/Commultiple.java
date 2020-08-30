package Algorithm.Math;

import java.util.Scanner;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Commultiple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * b / recur(a, b));

    }

    public static int recur(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a > b) {
            int diff = a - b;
            return recur(b, diff);
        } else {
            int diff = b - a;
            return recur(a, diff);
        }
    }
}
