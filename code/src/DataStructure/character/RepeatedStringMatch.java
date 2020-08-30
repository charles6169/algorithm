package DataStructure.character;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class RepeatedStringMatch {
    public static int repeatedStringMatch(String A, String B) {
        StringBuffer stringBuffer = new StringBuffer(A);
        int num = 1;
        while (stringBuffer.length() < 10000) {
            if (kmp(stringBuffer, B)) {
                break;
            }
            stringBuffer.append(A);
            num++;
        }
        return num;

    }

    public static boolean kmp(StringBuffer stringBuffer, String B) {
        String A = stringBuffer.toString();
        if (B.length() < 1) {
            return false;
        }

        if (A == null || B == null || A.length() < 1 || B.length() < 1) {
            return true;
        }
        int index1 = 0;
        int index2 = 0;
        char[] char1 = A.toCharArray();
        char[] char2 = B.toCharArray();
        int[] next = getNext(char2);
        while (index1 < char1.length && index2 < char2.length) {
            if (char1[index1] == char2[index2]) {
                index1++;
                index2++;
            } else if (next[index2] == -1) {
                index1++;
            } else {
                index2 = next[index2];
            }
        }
        return index2 == char2.length ? true : false;

    }


    public static int[] getNext(char[] char2) {
        if (char2.length <= 1) {
            return new int[]{-1};
        }
        int[] next = new int[char2.length];
        next[0] = -1;
        next[1] = 0;
        int index = 2;
        int cn = 0;
        while (index < char2.length) {
            if (char2[index] == char2[cn]) {
                next[index++] = ++cn;
            } else if (cn > 0) {
                cn = next[cn];
            } else {
                next[index++] = 0;
            }
        }
        return next;
    }
}
