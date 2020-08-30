package Examination.huawei;

import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String read = in.toString();
        List<String> stringList=new ArrayList<>();
        for (String s : read.split(";")) {
            stringList.add(s);
        }
        for (String s : stringList) {
            String[] str=s.split("->");
//            ListNode head=new ListNode(str)
        }

    }

    class ListNode {
        String val;
        String next;
    }


}
