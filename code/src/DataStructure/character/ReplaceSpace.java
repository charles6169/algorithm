package DataStructure.character;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */

public class ReplaceSpace {
    public static String replaceSpace1(String s) {
        String[] strings = s.split(" ");
        StringJoiner stringJoiner = new StringJoiner("");
        for (int i = 0; i < strings.length - 1; i++) {
            stringJoiner.add(strings[i]);
            stringJoiner.add("%20");
        }
        stringJoiner.add(strings[strings.length - 1]);
        return stringJoiner.toString();
    }

    public static String replaceSpace2(String s) {
        List<Character> characters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                characters.add(c);
            } else {
                characters.add('%');
                characters.add('2');
                characters.add('0');
            }
        }
        String res = "";
        for (char c : characters) {
            String s1 = String.valueOf(c);
            res = res.concat(s1);
        }
        return res;
    }


    public static String replaceSpace3(String s) {
        StringBuffer res = new StringBuffer();
//        注意类型是Character
        for (Character c : s.toCharArray()) {
//            res压入的是"%20" String类型
            if (c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }

}
