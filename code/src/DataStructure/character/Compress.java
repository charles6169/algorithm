package DataStructure.character;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：443. 压缩字符串
 * 给定一组字符，使用原地算法将其压缩。
 * 压缩后的长度必须始终小于或等于原数组长度。
 * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
 * 在完成原地修改输入数组后，返回数组的新长度。
 */

public class Compress {
    public static int compress1(char[] chars) {
        int anchor = 0, write = 0;
//        用read遍历
        for (int read = 0; read < chars.length; read++) {
//            read指向了最后一位 或者 read的后一位与read指向的值不相等
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[anchor];
                if (read > anchor) {
//                    先(read - anchor + 1)计算重复元素个数，再转换为数组，然后再写入chars中
                    for (char c : ("" + (read - anchor + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
//                anchor定位的是某个字母的第一次出现的位置
                anchor = read + 1;
            }
        }
//        返回weite，便是压缩后的长度
        return write;
    }
}
