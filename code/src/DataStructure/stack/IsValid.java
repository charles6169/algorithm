package DataStructure.stack;

import java.util.HashMap;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class IsValid {
    private HashMap<Character, Character> mappings;

    public IsValid() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid1(String s) {
        ArrayStack<Character> stack = new ArrayStack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
//            判断是否是key
            if (this.mappings.containsKey(c)) {
//                判断是否stack为空
                char topElement = stack.isEmpty() ? '#' : stack.pop();
//                判断是否是一对括号类型，是则无误，否则返回false
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
