package DataStructure.Array;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class ArrayDemo {

    //    数组任意位置插入元素
    public static int[] insertElement(int[] arr, int element, int index) {
        int l = arr.length;
        int temp[] = new int[l + 1];
        System.arraycopy(arr, 0, temp, 0, index);
        temp[index] = element;
        System.arraycopy(arr, index, temp, index + 1, l - index);
        return temp;
    }

    //    数组转化为整数
    public static int arrayToDecimal(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum * 10 + arr[i];
        }
        return sum;
    }

    //    整数转化为数组
    public static int[] decimalToArray(int num) {
        String str = String.valueOf(num);
        int[] tmp = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            tmp[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return tmp;
    }

    //    一维int数组转换为Integer数组
    public static Integer[] toIntegerArray1(int[] arr) {
        int n = arr.length;
        Integer[] iarr = new Integer[n];
        for (int i = 0; i < n; i++) {
            iarr[i] = new Integer(arr[i]);
        }
        return iarr;
    }

    //    二维int数组转换为Integer数组
    public static Integer[][] toIntegerArray2(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        Integer[][] iarr = new Integer[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                iarr[i][j] = (Integer) arr[i][j];
            }
        }
        return iarr;
    }


    //    二维char数组转换为Character数组
    public static Character[][] toCharacterArray2(char[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        Character[][] iarr = new Character[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                iarr[i][j] = (Character) arr[i][j];
            }
        }
        return iarr;
    }


    //    二维boolean数组转换为Boolean数组
    public static Boolean[][] toBooleanArray2(boolean[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        Boolean[][] iarr = new Boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                iarr[i][j] = (Boolean) arr[i][j];
            }
        }
        return iarr;
    }


    //    打印数组
    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    //    ArrayList与Arr之间的转换
    public void arrayListWithArr() {
        Stack
        int[] data = {4, 5, 3, 6, 2, 5, 1};

        // 常用   int[] 转 List<Integer>
        List<Integer> list1 = Arrays.stream(data).boxed().collect(Collectors.toList());
        // Arrays.stream(arr) 可以替换成IntStream.of(arr)。
        // 1.使用Arrays.stream将int[]转换成IntStream。
        // 2.使用IntStream中的boxed()装箱。将IntStream转换成Stream<Integer>。
        // 3.使用Stream的collect()，将Stream<T>转换成List<T>，因此正是List<Integer>。

        //常用 List<Integer> 转 int[]
        int[] arr1 = list1.stream().mapToInt(Integer::valueOf).toArray();
        // 想要转换成int[]类型，就得先转成IntStream。
        // 这里就通过mapToInt()把Stream<Integer>调用Integer::valueOf来转成IntStream
        // 而IntStream中默认toArray()转成int[]。
        //int[] 转 Integer[]

        Integer[] integers1 = Arrays.stream(data).boxed().toArray(Integer[]::new);
        // 前两步同上，此时是Stream<Integer>。
        // 然后使用Stream的toArray，传入IntFunction<A[]> generator。
        // 这样就可以返回Integer数组。
        // 不然默认是Object[]。


        // List<Integer> 转 Integer[]
        Integer[] integers2 = list1.toArray(new Integer[0]);
        //  调用toArray。传入参数T[] a。这种用法是目前推荐的。
        // List<String>转String[]也同理。


        // Integer[] 转 int[]
        int[] arr2 = Arrays.stream(integers1).mapToInt(Integer::valueOf).toArray();
        // 思路同上。先将Integer[]转成Stream<Integer>，再转成IntStream。

        // Integer[] 转 List<Integer>
        List<Integer> list2 = Arrays.asList(integers1);
        // 最简单的方式。String[]转List<String>也同理。

        // 同理
        String[] strings1 = {"a", "b", "c"};
        // String[] 转 List<String>
        List<String> list3 = Arrays.asList(strings1);
        // List<String> 转 String[]
        String[] strings2 = list3.toArray(new String[0]);

    }


}
