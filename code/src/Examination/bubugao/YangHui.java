package Examination.bubugao;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class YangHui {

    public static void yangHui() {
        int[][] arr = new int[6][12];
        arr[0][6] = 1;
        int l = 5;
        int r = 7;
        for (int i = 1; i < 6; i++) {
            arr[i][l] = 1;
            arr[i][r] = 1;
            int temp = l + 2;
            while (temp < r) {
                arr[i][temp] = arr[i - 1][temp - 1] + arr[i - 1][temp + 1];
                temp += 2;
            }
            l -= 1;
            r += 1;
        }

        for (int[] ar : arr) {
            for (int i : ar) {
                if(i==0){
                    System.out.print(" ");
                }else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }

    }

}
