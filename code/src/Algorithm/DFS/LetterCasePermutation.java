package Algorithm.DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class LetterCasePermutation {
    public static List<String> letterCasePermutation(String S) {
        int len = S.length();
        List<String> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        char[] path = new char[len];
        dfs(S, 0, len, path, res);
        return res;
    }

    private static void dfs(String S, int index, int len, char[] path, List<String> res) {
        if (index == len) {
            res.add(new String(path));
            return;
        }
        path[index] = S.charAt(index);
        dfs(S, index + 1, len, path, res);

        // 如果是字符，就可以派生出一个新分支
        if (Character.isLetter(S.charAt(index))) {
            // 这一步直接修改，相当于回溯
            path[index] = (char) (S.charAt(index) ^ (1 << 5));
            dfs(S, index + 1, len, path, res);
        }
    }

}
