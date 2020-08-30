package Algorithm.DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：401. 二进制手表
 * 二进制手表顶部有 4 个 LED 代表小时（0-11），底部的 6 个 LED 代表分钟（0-59）。
 *
 * 每个 LED 代表一个 0 或 1，最低位在右侧。
 */

public class ReadBinaryWatch {
//    深度优先搜索
    public List<String> readBinaryWatch1(int num) {
        List<String> res = new ArrayList<String>();
        for(int i=0;i<=num;i++){
            List<Integer> hours = new ArrayList<Integer>();
            List<Integer> minutes = new ArrayList<Integer>();
            dfs(0,12,0,i,0,4,hours);
            dfs(0,60,0,num-i,0,6,minutes);
            for(int j=0;j<hours.size();j++){
                for(int k=0;k<minutes.size();k++){
                    String str = hours.get(j)+":";
                    int value = minutes.get(k);
                    if(value<10){
                        str = str+"0"+value;
                    }else{
                        str = str+value;
                    }
                    res.add(str);
                }
            }
        }
        return res;
    }

    /*
     * value记录当前的时间数值
     * max 当前时间所允许的最大值
     * m 当前亮灯的个数
     * num 要求的亮灯个数
     * curOffSet 当前的偏移量
     * offset 二进制所允许的偏移量
     */
    public void dfs(int value, int max, int m, int num, int curOffSet, int offset, List<Integer> list){
        if(m>num) return;
        if(m==num){
            list.add(value);
            return;
        }
        for(int i=curOffSet;i<offset;i++){
            int temp = 1<<i;//二进制手表，当然要进行位运算了
            int tpValue = value|temp;
            if(tpValue==value) continue;//与原数没变化，继续进行循环
            if(tpValue>=max) continue;
            dfs(tpValue,max,m+1,num,i+1,offset,list);
        }
    }


//    暴力穷举
    public List<String> readBinaryWatch2(int num) {
        List<String> ans = new ArrayList<String>();
        String[][] hstrs = {{"0"}, {"1","2","4","8"}, {"3","5","6","9","10"}, {"7","11"}};
        String[][] mstrs = {{"00"}, {"01","02","04","08","16","32"}, {"03","05","06","09","10","12","17","18","20","24","33","34","36","40","48"}, {"07","11","13","14","19","21","22","25","26","28","35","37","38","41","42","44","49","50","52","56"}, {"15","23","27","29","30","39","43","45","46","51","53","54","57","58"}, {"31","47","55","59"}};

        for(int i = 0; i <= Math.min(3,num); i++) {
            if (num - i > 5) continue;
            String[] hstr = hstrs[i];
            String[] mstr = mstrs[num - i];
            for(int j = 0; j < hstr.length; j++) {
                for(int k = 0; k < mstr.length; k++) {
                    ans.add(hstr[j] + ":" + mstr[k]);
                };
            };
        };
        return ans;

    }
}
