package Algorithm.Sort;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class SortDemo {
    //    冒泡排序
    public static int[] bubbleSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
//                核心交换步骤
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //    插入排序
    public static int[] insertSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //    选择排序
    public int[] selectSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
//            将minIndex位置的元素和i元素位置调换
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] quickSort(int[] arr) {
        if (arr == null || arr.length == 1 || arr.length == 0) {
            return arr;
        }
        recur(arr, 0, arr.length - 1);
        return arr;
    }

    public static void recur(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int i = left, j = right;
        int base = arr[left];
        while (i != j) {
            while (arr[j] >= base && i < j) {
                j--;
            }
            while (arr[i] <= base && i < j) {
                i++;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[left] = arr[i];
        arr[i] = base;
        recur(arr, left, i - 1);
        recur(arr, i + 1, right);
    }


    public static int[] shellSort(int[] arr) {
        int gap = arr.length / 2;
        while (gap > 0) {
            for (int j = gap; j < arr.length; j++) {
                int i = j;
                while (i >= gap && arr[i - gap] > arr[i]) {
                    int temp = arr[i - gap];
                    arr[i - gap] = arr[i];
                    arr[i] = temp;
                    i -= gap;
                }
            }
            gap = gap / 2;
        }
        return arr;
    }


    /**
     * 创建堆，
     * @param arr 待排序列
     */
    public static int[] heapSort(int[] arr) {
        //创建堆
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr, i, arr.length);
        }

        //调整堆结构+交换堆顶元素与末尾元素
        for (int i = arr.length - 1; i > 0; i--) {
            //将堆顶元素与末尾元素进行交换
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            //重新对堆进行调整
            adjustHeap(arr, 0, i);
        }

        return arr;
    }

    /**
     * 调整堆
     * @param arr 待排序列
     * @param parent 父节点
     * @param length 待排序列尾元素索引
     */
    public static void adjustHeap(int[] arr, int parent, int length) {
        //将temp作为父节点
        int temp = arr[parent];
        //左孩子
        int lChild = 2 * parent + 1;

        while (lChild < length) {
            //右孩子
            int rChild = lChild + 1;
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if (rChild < length && arr[lChild] < arr[rChild]) {
                lChild++;
            }

            // 如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp >= arr[lChild]) {
                break;
            }

            // 把孩子结点的值赋给父结点
            arr[parent] = arr[lChild];

            //选取孩子结点的左孩子结点,继续向下筛选
            parent = lChild;
            lChild = 2 * lChild + 1;
        }
        arr[parent] = temp;
    }



}
