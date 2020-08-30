package Algorithm.window;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class MinWindow {
    public static String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen == 0 || tLen == 0 || sLen < tLen) {
            return "";
        }
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        int[] winFreq = new int[128];
        int[] tFreq = new int[128];
        for (char c : T) {
            tFreq[c]++;
        }
        int distance = 0;
        int minLen = sLen + 1;
        int begin = 0;
        int left = 0;
        int right = 0;


        while (right < sLen) {
            char charRight = S[right];
            if (tFreq[charRight] == 0) {
                right++;
                continue;
            }
            if (winFreq[charRight] < tFreq[charRight]) {
                distance++;
            }
            winFreq[charRight]++;
            right++;
            while (distance == tLen) {
                if (right - left < minLen) {
                    minLen = right - left;
                    begin = left;
                }

                char charLeft = S[left];
                if (tFreq[charLeft] == 0) {
                    left++;
                    continue;
                }
                if (winFreq[charLeft] == tFreq[charLeft]) {
                    distance--;
                }
                winFreq[charLeft]--;
                left++;
            }
        }
        if (minLen == sLen +1) {
            return "";
        }
        return s.substring(begin, begin + minLen);

    }
}
