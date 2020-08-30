package Visualization;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class GraphVisual<T> {

    public int loop;

    public void drawArrayGraph(T[][] nums) {
        System.out.print("loop: " + loop);
        loop++;
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
