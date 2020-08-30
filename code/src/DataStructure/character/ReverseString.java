package DataStructure.character;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class ReverseString {
    public static void reverseString(char[] s) {
        recur(s, 0, s.length-1);

    }

    public static void recur(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }
        recur(s, start + 1, end - 1);
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

    }
}
