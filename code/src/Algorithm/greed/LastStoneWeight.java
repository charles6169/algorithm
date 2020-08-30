package Algorithm.greed;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        int index = stones.length - 1;
        for(int i = 0; i < stones.length - 1; i++){     //通过stones.length来判断需要操作的次数。（不用将stones.length == 1的情况单独考虑）
            Arrays.sort(stones);                        //将sort放在循环体的开始。（避免在循环体外再写一次重复的sort（））
            stones[index] -= stones[index-1];           //两种不同情况使用同一表达式处理。（）
            stones[index-1] = 0;
        }
        return stones[stones.length-1];

    }

}
