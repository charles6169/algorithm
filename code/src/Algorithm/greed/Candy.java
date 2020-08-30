package Algorithm.greed;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Candy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        String[] s2 = sc.nextLine().split(" ");
        int[] child = new int[s1.length];
        int[] candy = new int[s2.length];
        for (int i = 0; i < child.length; i++) {
            child[i] = Integer.parseInt(s1[i]);
        }
        for (int i = 0; i < candy.length; i++) {
            candy[i] = Integer.parseInt(s2[i]);
        }
        Arrays.sort(child);
        Arrays.sort(candy);
        int ci = 0;
        int ca = 0;
        while (ci < child.length && ca < candy.length) {
            if (child[ci] <= candy[ca]) {
                ci++;
            }
            ca++;
        }
        System.out.println(ci);


    }
}
