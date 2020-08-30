package Algorithm.DFS;

import DataStructure.Array.Array;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class LetterCombinations {
    private static String letterMap[] = {
            " ",    //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };


    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.equals("")) {
            return res;
        }
        dfs(digits, 0, "", res);
        return res;
    }

    public static void dfs(String digits, int index, String path, List<String> res) {
        if (index == digits.length()) {
            res.add(path);
            return;
        }
        Character c = digits.charAt(index);
        String letters = letterMap[c - '0'];
        for (int i = 0; i < letters.length(); i++) {
            dfs(digits, index + 1, path + letters.charAt(i), res);
        }
        return;
    }


}
