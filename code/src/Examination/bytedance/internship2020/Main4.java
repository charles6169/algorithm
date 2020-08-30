package Examination.bytedance.internship2020;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Main4 {
    static String str;
    static int count;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] nums = read(in);
        for (String[] num : nums) {
            switch (num[0]) {
                case "1":
                    int pos = Integer.parseInt(num[1]);
                    char c = num[2].charAt(0);
                    char[] chars1 = str.toCharArray();
                    chars1[pos] = c;
                    str = chars1.toString();
                    break;
                case "2":
                    int query = Integer.parseInt(num[1]);
                    char[] chars2 = str.toCharArray();
                    char r = chars2[query];
                    System.out.println(r);

                    break;
                default:
                    break;
            }
        }

    }

    public static String[][] read(Scanner in) {
        str = in.nextLine();
        count = in.nextInt();
        in.nextLine();

        String[][] nums = new String[count][3];
        for (int i = 0; i < count; i++) {
            String temp = in.nextLine();
            String[] strings = temp.trim().split(" ");
            nums[i][0] = strings[0];
            nums[i][1] = strings[1];
            nums[i][2] = strings[2];

        }
        return nums;

    }

}
