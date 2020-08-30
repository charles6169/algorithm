package Examination.tencent.internship2018;

import java.util.Scanner;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String temp = scanner.nextLine();
        String[] strings = temp.trim().split(" ");
        long n = Integer.parseInt(strings[0]);
        long m = Integer.parseInt(strings[1]);
        System.out.println(solve(n, m));

    }

    public static long solve(long n, long m) {
        return (n * m) / 2;
    }


}
