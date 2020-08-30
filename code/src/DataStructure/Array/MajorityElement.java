package DataStructure.Array;

import DataStructure.Map.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：超过半数的数
 */

public class MajorityElement {
    public static int majorityElement1(int[] nums) {
        if(nums.length!=1){
            Map<Integer, Integer> map = new HashMap<>();
            for (int m : nums) {
                if (map.containsKey(m)) {
                    map.put(m, map.get(m) + 1);
                } else {
                    map.put(m, 1);
                }
            }
            for (int k : map.keySet()) {
                if (map.get(k) > nums.length / 2) {
                    return k;
                }
            }
        }
        return nums[0];
    }
}
