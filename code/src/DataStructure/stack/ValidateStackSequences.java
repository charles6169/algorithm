import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class ValidateStackSequences {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0, len = pushed.length; i < len; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && index < len && popped[index] == stack.peek()) {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}
