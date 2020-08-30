package Examination.huawei;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Main1 {
    static List<String> stringList=new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        read(in);
//        in.nextLine();
//        stringList.add(s1);


        int i=1;


//        String test=in.toString();

//        String split = in.nextLine();

//        StringBuffer stringBuffer = new StringBuffer();
//        List<StringBuffer> stringBuffers = new ArrayList<>();
//        int res = 1;
//        List<String> read = read(in);
//        if (read.size() == 0) {
//            System.out.println(0);
//        }
//        for (String s : read) {
//            String[] strs = s.trim().split(",");
//            if (strs[1].equals(split)) {
//                res++;
//                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
//                stringBuffers.add(stringBuffer);
//                stringBuffer = new StringBuffer();
//            } else {
//                stringBuffer.append(s);
//                stringBuffer.append("|");
//            }
//        }
//        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
//        stringBuffers.add(stringBuffer);
//        System.out.println(res);
//        for (StringBuffer buffer : stringBuffers) {
//            System.out.println(buffer);
//        }

    }

    public static void read(Scanner in) {
        while(in.hasNext()) {
            String s=in.next();
            stringList.add(s);
        }
    }

}
