package Algorithm.DFS;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题12. 矩阵中的路径
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。
 * 如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
 * 例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
 * <p>
 * [["a","b","c","e"],
 * ["s","f","c","s"],
 * ["a","d","e","e"]]
 * <p>
 * 但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。
 */

public class Exist {
    //    深度优先搜索
    public static boolean exist1(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, char[] word, int i, int j, int k) {
//        误值判断
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) return false;
//        搜索完毕，返回
        if (k == word.length - 1) return true;
//        取出待搜索的值
        char tmp = board[i][j];
//        已搜索过的路径改变为'/'
        board[i][j] = '/';
//        向上下左右是个方向搜索 分别解读为i+1,i-1,j+1,j-1 之间用 或 连接
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i, j - 1, k + 1);
//        回溯到上一个字母
        board[i][j] = tmp;
        return res;
    }

}
