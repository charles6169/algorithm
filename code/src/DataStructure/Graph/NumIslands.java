package DataStructure.Graph;

import DataStructure.Array.ArrayDemo;
import Visualization.GraphVisual;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class NumIslands {

    static GraphVisual graphVisual=new GraphVisual();

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int nr = grid.length;
        int nc = grid[0].length;
        int res = 0;
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    dfs(grid, i, j);
                }
            }
        }
        return res;
    }

    public static void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || r >= nr || c < 0 || c >= nc || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0';

        graphVisual.drawArrayGraph(ArrayDemo.toCharacterArray2(grid));
        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }
}
