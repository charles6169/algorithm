package Algorithm.DFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        Deque<Character> path = new ArrayDeque<>();
        if (n == 0) {
            return res;
        }

//        dfs();
        return res;
    }

    public void dfs(int n, int left, int right, Deque<Character> path, List<String> res) {
        if (left == 0 && right == 0) {
            StringBuffer stringBuffer=new StringBuffer();
            for (Character character : path) {
                stringBuffer.append(character);
            }
            res.add(stringBuffer.toString());
            return;
        }



    }

}
