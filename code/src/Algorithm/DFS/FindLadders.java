package Algorithm.DFS;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题 17.22. 单词转换
 * 给定字典中的两个词，长度相等。
 * 写一个方法，把一个词转换成另一个词， 但是一次只能改变一个字符。
 * 每一步得到的新词都必须能在字典中找到。
 * 编写一个程序，返回一个可能的转换序列。
 * 如有多个可能的转换序列，你可以返回任何一个。
 */

public class FindLadders {
//    太难了...
    public static Set<String> hashSet = new HashSet<>();
    public static Map<Integer, Set<Character>> wordReplaceList = new HashMap<>();
    public static String res;

    public static List<String> findLadders1(String beginWord, String endWord, List<String> wordList) {
        for (String word : wordList) {
            hashSet.add(word);
//            此步的功能：统计每个word的单词的各个位上，分别出现过哪些单词，记入Map（wordReplaceList）中
//            最终的结果是0号位上，出现过c,d,h,l,1号位上出现过o,2号位上出现过t和g
            for (int i = 0; i < word.length(); i++) {
//                computeIfAbsent的功能解读：在i位插入一个值，如果Map没有i这个键，那么创建一个i键，再把值插入到i键
                Set<Character> set = wordReplaceList.computeIfAbsent(i, k -> new HashSet<>());
//                这个set是不存在的
                set.add(word.charAt(i));
            }
        }
//        如果不存在结束单词，直接返回
        if (!hashSet.contains(endWord)) {
            return new ArrayList<>();
        }
//        先将起始单词移除
        hashSet.remove(beginWord);
//        深搜
        dfs(beginWord, beginWord, endWord);
//        返回值是String列表，而res为String类型，故而返回时需要转换一下
        return res == null ? new ArrayList<>() : Arrays.stream(res.split(",")).collect(Collectors.toList());
    }
//    prefix：前缀

    public static void dfs(String word, String prefix, String endWord) {
//        如果起始单词等于了结束单词，那么很简单，直接返回即可
        if (word.equals(endWord)) {
            res = prefix;
            return;
        }
        for (int i = 0; i < word.length(); i++) {
            for (Character ch : wordReplaceList.get(i)) {
                if (ch == word.charAt(i)) {
                    continue;
                }
//                用ch替换和word中的第i位，组成nextWord的尝试
                String nextWord = word.substring(0, i) + ch + word.substring(i + 1);
                if (!hashSet.contains(nextWord)) {
//                    如果词汇表中没有nextWord项，直接跳过
                    continue;
                }
                hashSet.remove(nextWord);
//                如果res为空，则递归
                if (res == null) {
                    dfs(nextWord, prefix + "," + nextWord, endWord);
                }
            }
        }
    }
}
