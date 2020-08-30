package Visualization;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class MemoryVisual<K, V> {

    public void drawMemoryMap(Map<K, V> memory) {
        List<V> value = new ArrayList<>();
        System.out.print("memory: [");
        for (K k : memory.keySet()) {
            System.out.print(k);
            System.out.print(" : ");
            System.out.print(memory.get(k));
            System.out.print(" | ");
        }
        System.out.print(" ]");

    }


}
