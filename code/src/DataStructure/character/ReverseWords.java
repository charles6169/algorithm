package DataStructure.character;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题58 - I. 翻转单词顺序
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
 * 为简单起见，标点符号和普通字母一样处理。
 */

public class ReverseWords {
//    原创
    public static String reverseWords1(String s) {
        Stack<String> stringStack = new Stack<>();
        String[] wordSplit = s.split(" ");
        for (String word : wordSplit) {
            stringStack.push(word);
        }
        String delimiter = " ";
        StringJoiner joiner = new StringJoiner(delimiter);
        while (!stringStack.isEmpty()) {
            joiner.add(stringStack.pop());
        }
        return joiner.toString();
    }

//    超简单写法
    public static String reverseWords2(String s) {
        List<String> res = Arrays.asList(s.trim().split(" "));
        Collections.reverse(res);
        return res.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining(" "));
    }
}
