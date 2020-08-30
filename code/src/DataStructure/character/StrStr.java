package DataStructure.character;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class StrStr {
    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || haystack.length() < 1 || needle.length() < 1) {
            return -1;
        }
        int index1 = 0;
        int index2 = 0;
        char[] char1 = haystack.toCharArray();
        char[] char2 = needle.toCharArray();
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
        return index2 == char2.length ? index1 - index2 : -1;

    }

    public static int[] getNext(char[] char2) {
        if (char2.length == 1) {
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
