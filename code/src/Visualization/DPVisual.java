package Visualization;

import DataStructure.Array.ArrayDemo;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class DPVisual<T> {

//    可视化动态规划
    public void drawDp0(T num) {
        System.out.print("loop: " );
        System.out.print(num);
        System.out.println();

    }


//    dpDemo.drawDp1(ArrayDemo.toIntegerArray1(dp));
    public void drawDp1(T[] nums) {
        System.out.print("loop: " );
        System.out.print("| ");
        for (T num : nums) {
            System.out.print(num);
            System.out.print(" | ");
        }
        System.out.println();
    }

    //dpDemo.drawDp2(ArrayDemo.toIntegerArray2(dp));
    public void drawDp2(T[][] nums) {
        System.out.print("loop: " );
        System.out.println();
        for (T[] num : nums) {
            System.out.print("| ");
            for (T t : num) {
                System.out.print(t);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }


}
