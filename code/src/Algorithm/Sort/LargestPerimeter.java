package Algorithm.Sort;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class LargestPerimeter {
    //    原创 未实现
    public int largestPerimeter1(int[] A) {
        bubbleSort(A);
        if (A.length == 3 && (A[1] + A[2]) <= A[0]) {
            return 0;
        }
        int perimeter = 0;
        for (int i = 2; i <= A.length - 1; i++) {
            if (A[0] < A[1] + A[i]) {
                perimeter = A[0] + A[1] + A[i];
                return perimeter;
            }
        }
        return perimeter;
    }

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] > arr[j]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public int largestPerimeter2(int[] A) {
        bubbleSort(A);
        for (int i = A.length - 3; i >= 0; --i) {
            if (A[i] + A[i + 1] > A[i + 2]) {
                return A[i] + A[i + 1] + A[i + 2];
            }
        }
        return 0;
    }

}
