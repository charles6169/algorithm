package Algorithm.Sort;

import java.util.Arrays;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class IsAnagram {
    //    原创
    public boolean isAnagram1(String s, String t) {
        String[] S = s.split("");
        String[] T = t.split("");
        bubbleSort(S);
        bubbleSort(T);
        return Arrays.equals(S, T);
    }

    public void bubbleSort(String[] arr) {
        if (arr.length == 0) {
            System.out.println("输入数组不能为空");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1].compareTo(arr[j]) > 0) {
                    String temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
