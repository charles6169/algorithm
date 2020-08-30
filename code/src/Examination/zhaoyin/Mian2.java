package Examination.zhaoyin;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Mian2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());
        int[] nums = new int[count * 2];
        String tempStr = in.nextLine();
        String[] str = tempStr.trim().split(" ");
        for (int i = 0; i < count * 2; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }
        int m = 0;
        int target = 0;
        int time = 0;
        while (m < count) {
            if (nums[m] % 2 == 1) {
                target = nums[m] - 1;
            } else {
                target = nums[m] + 1;
            }
            if (nums[m + 1] != target) {
                for (int i = m + 2; i < count * 2; i++) {
                    if (target == nums[i]) {
                        int temp = nums[i];
                        nums[i] = nums[m + 1];
                        nums[m + 1] = temp;
                        time++;
                    }
                }
            }
            m += 2;
        }
        System.out.println(time);
    }
}
