package DataStructure.character;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class CountSegments {
    public static int countSegments(String s) {
        int res = 0;
        for (char c : s.toCharArray()) {
            int n = c;
            if ((n >= 65 && n < 90) || (n > 97 && n < 122)) {
                continue;
            } else {
                res++;
            }
        }
        return ++res;
    }
}
