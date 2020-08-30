package DataStructure.DisJointSet;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class DisJoinSetArray {

    private int[] parent = new int[1000];

    public static int find(int target, int[] parent) {
        int parentIndex = target;
        //当一个数组等于角标时，说明找到了根节点
        //从while循环出来的temp即为target对应的树的根节点所在patent数组的下标
        while (parent[parentIndex] != parentIndex) {
            parentIndex = parent[parentIndex];
        }
        //路径压缩
        int i = target;
        //把target以及target的双亲节点的全部赋值为根节点
        while (i != parentIndex) {
            //找到i对应的双亲节点
            i = parent[i];
            //把i的双亲节点直接赋值为根节点，达到路径压缩的目的
            parent[i] = parentIndex;
        }
        return parentIndex;
    }

    //要将两个树合并，分别找个两个树的根节点，把其中一个赋值为另一个的父节点即完成两颗树合并
    public static void join(int target1, int target2, int[] parent) {
        int root1 = find(target1, parent);
        int root2 = find(target2, parent);
        if (root1 != root2) {
            parent[root1] = root2;
        }
    }


}
