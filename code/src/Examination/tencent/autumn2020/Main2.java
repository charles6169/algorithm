package Examination.tencent.autumn2020;

import java.util.Scanner;
import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */


public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = solve(arr);
        for (int a : res) {
            System.out.print(a + " ");
        }

    }


    public static int[] solve(int[] arr) {
        int len = arr.length;
        int[] res = new int[len];
        int[] rightLook = new int[len];  //rightLook 保留往右看 可以看得到的楼数量数组
        Stack<Integer> stack = new Stack<>();  // stack中要保存的是 能看见的楼的 index
        for (int i = len - 1; i >= 0; i--) {
            rightLook[i] = stack.size();
            while ((!stack.isEmpty()) && (arr[i] >= arr[stack.peek()])) {  //while循环是为下一位执行的
                stack.pop();  //如果大于则说明栈中的楼已经看不到了
            }
            stack.push(i); //将当前楼的索引加入栈
        }
        stack.clear();
        for (int i = 0; i < len; i++) {
            int total = rightLook[i] + 1 + stack.size();
            while ((!stack.isEmpty()) && (arr[i] >= arr[stack.peek()])) {
                stack.pop();
            }
            res[i] = total;
            stack.push(i);
        }
        return res;
    }

}
