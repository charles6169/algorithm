package Examination.zhaoyin;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String[] strs1 = str1.trim().split(" ");
        String str2 = in.nextLine();
        String[] strs2 = str2.trim().split(" ");
        int n = Integer.parseInt(strs1[0]);
        int m = Integer.parseInt(strs1[1]);
        int[] nums = new int[strs2.length];
        for (int i = 0; i < strs2.length; i++) {
            nums[i] = Integer.parseInt(strs2[i]);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.keySet().contains(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        int tempKey = 0;
        int tempValue = map.get(nums[tempKey]);
        for (Integer i : map.keySet()) {
            if (tempValue < map.get(i)) {
                tempValue = map.get(i);
                tempKey = i;
            }
        }
        List<Integer> low = new ArrayList<>();
        List<Integer> high = new ArrayList<>();
        for (int num : nums) {
            if (num > tempKey) {
                high.add(num);
            }
            if (num < tempKey) {
                low.add(num);
            }
        }
        int[] l = low.stream().mapToInt(Integer::valueOf).toArray();
        int[] h = high.stream().mapToInt(Integer::valueOf).toArray();
        Arrays.sort(l);
        Arrays.sort(h);
        List<Integer> res = new ArrayList<>();
        int te = 0;
        int lt = 0;
        int ht = h.length-1;
        while (te < m - tempValue) {
            int labs = Integer.MAX_VALUE;
            int habs = Integer.MAX_VALUE;
            if (lt < l.length) {
                labs = Math.abs(l[lt] - tempKey);
            }
            if (ht >= 0) {
                habs = Math.abs(h[ht] - tempKey);
            }
            if (labs <= habs) {
                res.add(labs);
                lt++;
            }else{
                res.add(habs);
                ht--;
            }
            te++;
        }
        res.stream().mapToInt(Integer::valueOf).toArray();
        int sum=0;
        for (Integer re : res) {
            sum+=re;
        }
        System.out.println(sum);

    }
}
