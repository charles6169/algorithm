package DataStructure.Array;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题61. 扑克牌中的顺子
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，
 * 即这5张牌是不是连续的。
 */

public class IsStraight {
    public static boolean isStraight1(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int zero = 0;
        for (int i = 0; i < 5; i++) {
            if (nums[i] == 0) {
                zero++;
            }
            arrayList.add(nums[i]);
        }
        Collections.sort(arrayList);
        Set<Integer> set = new HashSet<Integer>();
        for (int i = zero; i < 5; i++) {
//            判断有无重复的元素
            if (set.add(arrayList.get(i))) {
            } else {
                return false;
            }
        }
//        关键：然后判断余下元素最大与最小之差是否超过4（4个0时即差为0）
//        如果在4以内都可以用大王小王代替，但是大于4则无法，arrayList.get(zero)便是此时最小数
        if ((arrayList.get(4) - arrayList.get(zero)) <= 4) {
            return true;
        }
        return false;
    }
}
