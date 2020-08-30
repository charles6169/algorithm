package DataStructure.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题50. 第一个只出现一次的字符
 * 在字符串 s 中找出第一个只出现一次的字符。
 * 如果没有，返回一个单空格。
 */

public class FirstUniqChar {
    public static char firstUniqChar1(String s) {
        Map<Character, Integer> characterMap = new HashMap<>();
        if (s != "") {
            for (char c : s.toCharArray()) {
                if (!characterMap.containsKey(c)) {
                    characterMap.put(c, 1);
                } else {
                    characterMap.put(c, 2);
                }
            }
//            注意，hashMap的key是随机排序的
            for (char c : s.toCharArray()) {
                if (characterMap.get(c) == 1) {
                    return c;
                }
            }
        }
        return ' ';
    }
}
