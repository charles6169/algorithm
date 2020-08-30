package Algorithm.Search;

import java.util.Scanner;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class CatFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int h = Integer.parseInt(sc.nextLine());
        int[] data = new int[str.length];
        int maxSpeed = Integer.MIN_VALUE;  //最大速度，初始为最大数组元素
        for (int i = 0; i < str.length; i++) {
            data[i] = Integer.parseInt(str[i]);
            maxSpeed = Math.max(maxSpeed, data[i]);
        }
        int mid = 0;
        int minSpeed = 1;  ////最小速度，初始为1
        while (minSpeed <= maxSpeed) {
            //二分查找
            mid = minSpeed + ((maxSpeed - minSpeed) >> 1);
            //以当前速度吃完猫粮作为二分的逻辑判断,主人返回时间为分界点
            if (getTime(data, mid) <= h) {
                maxSpeed = mid - 1;
            } else {
                minSpeed = mid + 1;
            }
        }
        System.out.println(minSpeed);
    }

    public static int getTime(int[] data, int k) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            //判断是否整除，决定直接加上或者多加1小时
            sum += data[i] % k == 0 ? data[i] / k : data[i] / k + 1;
        }
        return sum;
    }
}
