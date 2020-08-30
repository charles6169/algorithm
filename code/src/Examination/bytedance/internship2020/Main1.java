package Examination.bytedance.internship2020;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Main1 {
    static Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] nums = read(in);
        StringBuffer stringBuffer = new StringBuffer();
        for (String[] num : nums) {
            switch (num[0]) {
                case "1":
                    stringBuffer.append(num[1]);
                    stack.push(stringBuffer.toString());
                    break;
                case "2":
                    int l = stringBuffer.length();
                    int k1 = Integer.parseInt(num[1]);
                    stringBuffer.replace(l - k1, l, "");
                    stack.push(stringBuffer.toString());
                    break;
                case "3":
                    int k2 = Integer.parseInt(num[1]);
                    char c = stringBuffer.charAt(k2 - 1);
                    System.out.println(c);
                    break;
                case "4":
//                    char[] chars=stack.pop().toCharArray();
                    stringBuffer.replace(0, stringBuffer.length(),"");
                    String sTemp = stack.pop();
                    stringBuffer.append(sTemp);
                    break;
                default:
                    break;
            }
        }


    }

    public static String[][] read(Scanner in) {
        int count = Integer.parseInt(in.nextLine());
        String[][] nums = new String[count][2];
        for (int i = 0; i < count; i++) {
            String temp = in.nextLine();
            String[] strs = temp.trim().split(" ");
            nums[i][0] = strs[0];
            if (Integer.parseInt(nums[i][0]) == 4) {
                nums[i][1] = "";
            } else {
                nums[i][1] = strs[1];
            }

        }
        return nums;
    }

}
