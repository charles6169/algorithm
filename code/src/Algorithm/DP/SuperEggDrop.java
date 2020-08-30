package Algorithm.DP;

import Visualization.MemoryVisual;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class SuperEggDrop {
    static Map<Integer,Integer> memory=new HashMap<>();
    public static int superEggDrop(int K, int N) {
        int res=dp(K,N);
        MemoryVisual memoryVisual=new MemoryVisual();
        memoryVisual.drawMemoryMap(memory);
        return res;
    }

    public static int dp(int K,int N){
        if(!memory.containsKey(N*100+K)){
            int ans;
            if(K==1){
                ans=N;
            }else if(N==0){
                ans=0;
            }else{
                int lo=1;
                int hi=N;
                while(lo+1<hi){
                    int mid=(lo+hi)/2;
                    int t1=dp(K-1,mid-1);
                    int t2=dp(K,N-mid);

                    if(t1>t2){
                        hi=mid;
                    }else if(t1<t2){
                        lo=mid;
                    }else{
                        lo=hi=mid;
                    }
                }
                ans=1+Math.min(Math.max(dp(K-1,lo-1),dp(K,N-lo)),Math.max(dp(K-1,hi-1),dp(K,N-hi)));
            }
            memory.put(N*100+K,ans);
        }
        return memory.get(N*100+K);
    }
}
