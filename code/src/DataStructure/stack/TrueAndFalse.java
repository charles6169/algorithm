

import java.util.Scanner;
import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class TrueAndFalse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        if (s.length == 1) {
            if ("and".equals(s[0]) || "or".equals(s[0])) {
                System.out.println("error");

            } else {
                System.out.println(s[0]);
            }
            return;
        }
        for (int i = 0; i < s.length; i++) {
            if (i % 2 == 0) {
                if ("and".equals(s[i]) || "or".equals(s[i])) {
                    System.out.println("error");
                    return;
                }
            } else {
                if ("true".equals(s[i]) || "false".equals(s[i])) {
                    System.out.println("error");
                    return;
                }
            }
        }


        String res = solve(s);
        System.out.println(res);

    }

    public static String solve(String[] s) {
        Stack<String> stack = new Stack();
        for (int i = 0; i < s.length; i++) {
            if ("and".equals(s[i])) {
                String peek = stack.pop();
                String ju1 = judge(s[i], peek, s[i + 1]);
                stack.push(ju1);
                i++;
            } else {
                stack.push(s[i]);
            }
        }
        String res = stack.pop();
        while (!stack.isEmpty()) {
            String temp = stack.pop();
            if ("or".equals(temp)) {
                String val = stack.pop();
                res = judge(temp, val, res);
            } else {
                res = "error";
                break;
            }
        }
        return res;
    }

    public static String judge(String check, String s1, String s2) {
        if ("and".equals(check)) {
            if ("true".equals(s1) && "true".equals(s2)) {
                return "true";
            } else {
                return "false";
            }
        } else if ("or".equals(check)) {
            if ("true".equals(s1) || "true".equals(s2)) {
                return "true";
            } else {
                return "false";
            }
        }
        return "error";
    }

}
