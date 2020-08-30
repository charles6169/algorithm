package DataStructure.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class ConstructArr {
//    实现，超时
    public static int[] constructArr1(int[] a) {
        if (a.length == 1) {
            return a;
        }
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = 1;
        }
        for (int i = 1; i < a.length; i++) {
            b[0] *= a[i];
        }
        for (int i = 0; i < a.length - 1; i++) {
            b[a.length - 1] *= a[i];
        }
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = 0; j < a.length; j++) {
                if (j != i) {
                    b[i] *= a[j];
                }
            }
        }
        return b;
    }


    public static int[] constructArr2(int[] a) {
        if(a.length==0)return a;
        int[] left = new int[a.length];   // save a[0]*a[1]*..
        int[] right = new int[a.length];  // save a[n-1]*a[n-2]*..
        left[0] = a[0];
        right[a.length-1] = a[a.length-1];

        for(int i=1;i<a.length-1;i++){
            left[i] = left[i-1]*a[i];
            right[a.length-i-1] = right[a.length-i]*a[a.length-i-1];
        }
        right[0] = right[1];
        for(int i=1;i<a.length-1;i++){
            right[i] = left[i-1]*right[i+1];
        }
        right[a.length-1] = left[a.length-2];
        return right;
    }
}
