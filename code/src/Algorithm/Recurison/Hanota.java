package Algorithm.Recurison;

import java.util.List;
import java.util.Stack;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题 08.06. 汉诺塔问题
 * 在经典汉诺塔问题中，
 * 有 3 根柱子及 N 个不同大小的穿孔圆盘，
 * 盘子可以滑入任意一根柱子。
 * 一开始，所有盘子自上而下按升序依次套在第一根柱子上
 * (即每一个盘子只能放在更大的盘子上面)。
 * 移动圆盘时受到以下限制:
 * (1) 每次只能移动一个盘子;
 * (2) 盘子只能从柱子顶端滑出移到下一根柱子;
 * (3) 盘子只能叠在比它大的盘子上。
 */

public class Hanota {
    static Stack<Integer> stackA = new Stack<>();
    static Stack<Integer> stackB = new Stack<>();
    static Stack<Integer> stackC = new Stack<>();
    static Stack<Integer> stackT = new Stack<>();

    public static void hanota1(List<Integer> A, List<Integer> B, List<Integer> C) {
        for (int i : A) {
            stackA.push(i);
        }
        A.clear();
        helper();
        while (!stackC.isEmpty()) {
            stackT.push(stackC.pop());
        }
        while (!stackT.isEmpty()) {
            C.add(stackT.pop());
        }
        return;
    }

    public static void helper() {
//        终止条件
        if (stackA.isEmpty()) {
            return;
        } else {
//            单级功能
            while (!stackC.isEmpty()) {
                stackB.push(stackC.pop());
            }
            stackC.push(stackA.pop());
            while (!stackB.isEmpty()) {
                stackC.push(stackB.pop());
            }
        }
//        等价关系 递归主体
        helper();
    }
}
