package Algorithm.window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class FindAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        char[] S = s.toCharArray();
        char[] P = p.toCharArray();
        int sLen = s.length();
        int pLen = p.length();
        List<Integer> res = new ArrayList<>();
        if (sLen < 0 || pLen < 0 || sLen < pLen) {
            return res;
        }
        int[] winFreq = new int[128];
        int[] pFreq = new int[128];

        for (int i = 0; i < pLen; i++) {
            pFreq[i]++;
        }
        int left = 0;
        int right = 0;

        while (right < sLen) {
            char charRight = S[right];
            winFreq[charRight]++;
            right++;
            while (winFreq[charRight] > pFreq[charRight]) {
                int charLeft = S[left];
                winFreq[charLeft]--;
                left++;
            }
            if (right - left == pLen) {
                res.add(left);
            }
        }
        return res;
    }

}
