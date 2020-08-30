package DataStructure.Array;


import java.util.Calendar;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class Maximum69Number {
    public int maximum69Number(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                break;
            }
        }
        Runtime runtime=Runtime.getRuntime();
//        Calendar
        String re=new String(chars);
        return Integer.parseInt(re);



    }
}
