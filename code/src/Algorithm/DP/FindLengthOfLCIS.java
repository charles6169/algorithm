package Algorithm.DP;

import DataStructure.Array.ArrayDemo;
import Visualization.DPVisual;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class FindLengthOfLCIS {
    public static int findLengthOfLCIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int len=nums.length;
        int[] dp=new int[len];
        dp[0]=1;
        int max=dp[0];
        DPVisual dpVisual=new DPVisual();
        for(int i=1;i<len;i++){
            if(nums[i]>nums[i-1]){
                dp[i]=dp[i-1]+1;
            }else{
                dp[i]=1;
            }
            max=Math.max(dp[i],max);
            dpVisual.drawDp1(ArrayDemo.toIntegerArray1(dp));
        }
        new StringBuilder("hello world");
        return max;
    }
}
