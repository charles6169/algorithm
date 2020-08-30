package DataStructure.character;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：784. 字母大小写全排列
 * 给定一个字符串S，通过将字符串S中的每个字母转变大小写，
 * 我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 * S = "a1b2"
 *  ["a1b2", "a1B2", "A1b2", "A1B2"]
 */

public class LetterCasePermutation {
    //    官解 迭代 
    public static List<String> letterCasePermutation1(String S) {
//        StringBuilder动态字符串类型
        List<StringBuilder> ans = new ArrayList<>();
        ans.add(new StringBuilder());
        for (char c : S.toCharArray()) {
            int n = ans.size();
            if (java.lang.Character.isLetter(c)) {
                for (int i = 0; i < n; ++i) {
//                    新增一个StringBuilder
                    ans.add(new StringBuilder(ans.get(i)));
//                    append方法是在后端拼接字符串
                    ans.get(i).append(java.lang.Character.toLowerCase(c));
                    ans.get(n + i).append(java.lang.Character.toUpperCase(c));
                }
            } else {
                for (int i = 0; i < n; ++i) {
                    ans.get(i).append(c);
                }
            }
        }
        List<String> finalans = new ArrayList<>();
        for (StringBuilder sb : ans) {
            finalans.add(sb.toString());
        }
        return finalans;
    }
}
