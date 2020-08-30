package DataStructure.stack;

import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class RemoveOuterParentheses {
    static Stack<Character> stack = new Stack<Character>();

    public static String removeOuterParentheses(String S) {
        char[] chars = S.toCharArray();
        for (char aChar : chars) {
            stack.push(aChar);
        }




        return null;

    }
}
