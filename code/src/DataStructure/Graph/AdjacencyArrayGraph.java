package DataStructure.Graph;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class AdjacencyArrayGraph {
    int[] form;
    int[] to;
    int[] weight;
    int[] first;
    int[] next;

    public AdjacencyArrayGraph(int n, int m, int[][] arr) throws FileNotFoundException {
        int[] form = new int[m];
        int[] to = new int[m];
        int[] weight = new int[m];
        int[] first = new int[n];
        int[] next = new int[m];

        for (int i = 0; i < m; i++) {
            //获取顶点起点
            form[i] = arr[i][0];
            //获取顶点终点
            to[i] = arr[i][1];
            //边的权值
            weight[i] = arr[i][2];
//            存疑?
            //减一都是为了对应数组角标
            //next使用新的边的编号作为位置，如果暂时用不到next，其值应该为-1，表示结尾
            //first[fromVertex[i]]存着原顶点fromVertex[i]的第一条边
            next[i] = first[form[i] - 1];
            //存储新的顶点的起始边
            first[form[i] - 1] = i;
        }

    }
}
