package Examination.bytedance.internship2020;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Main2 {
    static String str;
    static int count;
    static String[] strs;
    static int res;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        read(in);
        StringBuffer stringBuffer=new StringBuffer();
        return;


    }

    public static void backtrace(StringBuffer stringBuffer){
        if(stringBuffer.length()>=str.length()){
            return;
        }




    }


    public static void read(Scanner in) {
        str = in.nextLine();
        count = in.nextInt();
        strs = new String[count];
        in.nextLine();
        for (int i = 0; i < count; i++) {
            strs[i] = in.nextLine();
        }
    }
}
