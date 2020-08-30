package Examination.common;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Input {
    public static void main(String[] args) {
//        每行输入带有空格的数字,转为二维数组
//        6
//        2 1
//        3 2
//        4 3
//        5 2
//        6 1
        /**
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine()) - 1;
        int[][] nums = new int[count][2];
        for (int i = 0; i < count; i++) {
            String temp = in.nextLine();
            String[] strs = temp.trim().split(" ");
            nums[i][0] = Integer.parseInt(strs[0]);
            nums[i][1] = Integer.parseInt(strs[1]);
        }
        for (int[] num : nums) {
            for (int i : num) {
                System.out.println(i);
            }
        }
        */

//        输入带有数字和字符串
//        3
//        aa
//        b
//        ac
//        bbaac
        /**
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        in.nextLine();
        String[] strs = new String[count];
        for(int i=0;i<count;i++){
            strs[i] = in.nextLine();
        }
        String strT = in.nextLine();
        for (String str : strs) {
            System.out.println(str);
        }
        */
//        输入带有数字和符号
//        20,3
        /**
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(",");
        int m = Integer.valueOf(line[0]);
        int k = Integer.valueOf(line[1]);
        */



    }
}
