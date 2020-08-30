package Algorithm.Sort;

import java.util.ArrayList;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class SortArrayByParityTwo {
    public int[] sortArrayByParityII1(int[] A) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> bList = new ArrayList<Integer>();
        for (int i : A) {
            if (i % 2 == 0) {
                arrayList1.add(i);
            } else {
                arrayList2.add(i);
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                bList.add(arrayList1.get(0));
                arrayList1.remove(0);
            } else {
                bList.add(arrayList2.get(0));
                arrayList2.remove(0);
            }
        }
        int[] B = bList.stream().mapToInt(Integer::valueOf).toArray();
        return B;
    }
//    双指针法
    public int[] sortArrayByParityII2(int[] A) {
        int odd = 1;
        // 通过偶数下标来遍历
        for (int even = 0; even < A.length; even += 2) {
            // 1.如果为偶数，则进入下一次循环，检查下一个偶数下标的值是否为偶数
            // 2.如果非偶数，就用odd找到一个奇数下标的值为偶数来交换
            if (A[even] % 2 != 0) {
                // 偶数位出现不为偶数，说明奇数位肯定能找到偶数
                // 2.1 跳过奇数，找到一个奇数位为偶数值的下标
                while (A[odd] % 2 == 1) {
                    odd += 2;
                }
                // 2.2 奇数位找到偶数了，将偶数位的奇数和奇数位的偶数的值交换
                int tmp = A[even];
                A[even] = A[odd];
                A[odd] = tmp;
                // 奇数下标后移
                odd += 2;
            }
        }
        return A;
    }

}
