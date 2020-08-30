package Algorithm.Recurison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：面试题 16.11. 跳水板
 * 你正在使用一堆木板建造跳水板。
 * 有两种类型的木板，其中长度较短的木板长度为shorter，长度较长的木板长度为longer。
 * 你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。
 * 返回的长度需要从小到大排列。
 */

public class DivingBoard {
//    原创
    public static int[] divingBoard1(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[0];
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= k; i++) {
            int temp = i * shorter + (k - i) * longer;
            res.add(temp);
        }
        int[] arr = res.stream().mapToInt(Integer::valueOf).toArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                }
            }
        }
        return arr;
    }

//    官解
    public static int[] divingBoard2(int shorter, int longer, int k) {
        if( k == 0){
            return new int[0];
        }
        int[] arr = new int [k + 1];
        for(int i = 0 ; i <= k ; ++ i){
            arr[i] = shorter * (k - i)  +  longer * i ;
        }
        Arrays.sort(arr);
        int j = 0;
        for(int i = 0; i < k ; ++i ){
            if(arr[i] != arr[ i + 1]){
                arr[j++] = arr[i];
            }
        }
        arr[j] = arr[k];
        int[] arrs = new int [j + 1];
        for(int i = 0 ; i <= j ; ++ i){
            arrs[i] = arr[i];
        }
        return arrs;
    }
}
