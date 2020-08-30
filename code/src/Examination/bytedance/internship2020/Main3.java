package Examination.bytedance.internship2020;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Main3 {
    static int count;
    static int day;
    static int[] nums;
    static int[][] N;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        read(in);
        int res=0;
        for (int[] ints : N) {
            if(ints[0]!=ints[1]){
                res++;
            }
        }
        System.out.println(res);
    }

    public static void read(Scanner in) {
        String strs1 = in.nextLine();
        String[] strings1 = strs1.trim().split(" ");
        count = Integer.parseInt(strings1[0]);
        day = Integer.parseInt(strings1[1]);
        String strs2 = in.nextLine();
        nums = new int[count];
        String[] strings2 = strs2.trim().split(" ");
        for (int i = 0; i < count ;i++) {
            nums[i] = Integer.parseInt(strings2[i]);
        }
        N=new int[day][2];
        for (int i = 0; i < day; i++) {
            String temp=in.nextLine();
            String[] strs=temp.trim().split(" ");
            N[i][0]=Integer.parseInt(strs[0]);
            N[i][1]=Integer.parseInt(strs[1]);
        }
        return;

    }

}
