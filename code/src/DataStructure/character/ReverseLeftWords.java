package DataStructure.character;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题58 - II. 左旋转字符串
 * 字符串的左旋转操作是把字符串前面的
 * 若干个字符转移到字符串的尾部。
 */

public class ReverseLeftWords {
    public static String reverseLeftWords1(String s, int n) {
        char[] chars = s.toCharArray();
        char[] chars1 = new char[n];
        char[] chars2 = new char[s.length() - n];
        for (int i = 0; i < n; i++) {
            chars1[i] = chars[i];
        }
        for (int i = 0; i < s.length()-n; i++) {
            chars2[i] = chars[i+n];
        }
        String res = "";
        for (char j : chars2) {
            res = res.concat(String.valueOf(j));
        }
        for (char j : chars1) {
            res = res.concat(String.valueOf(j));
        }
        return res;
    }
}
