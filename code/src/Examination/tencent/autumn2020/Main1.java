package Examination.tencent.autumn2020;

import java.util.Scanner;
import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encodeString = sc.nextLine();
        System.out.println(solve(encodeString));
    }

    public static String solve(String words) {
        Stack<Integer> num_stack = new Stack<>();
        Stack<StringBuffer> str_stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == '[') {
                int pos = words.indexOf('|', i);
                int count = Integer.valueOf(words.substring(i + 1, pos));
                num_stack.push(count);
                str_stack.push(sb);
                i = pos;
                sb = new StringBuffer();
            } else if (words.charAt(i) == ']') {
                int count = num_stack.pop();
                StringBuffer tmp = str_stack.pop();

                for (int j = 0; j < count; j++) {
                    tmp.append(sb);
                }
                sb = tmp;
            } else {
                sb.append(words.charAt(i));
            }
        }
        return sb.toString();
    }
}
