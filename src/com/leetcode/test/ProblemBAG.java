package com.leetcode.test;
//背包问题
//一个背包的总容量为V,现在有N类物品,第i类物品的重量为weight[i],价值为value[i]
//那么往该背包里装东西,怎样装才能使得最终包内物品的总价值最大。这里装物品主要由三种装法：
//1、0-1背包：每类物品最多只能装一次
//2、多重背包：每类物品都有个数限制，第i类物品最多可以装num[i]次
//3、完全背包：每类物品可以无限次装进包内
//https://blog.csdn.net/lanyu_01/article/details/79815801
public class ProblemBAG {
    //1、0-1背包：每类物品最多只能装一次
    //public static int ZeroOnePack2(int V,int N,int[] weight,int[] value){
    //        //动态规划
    //        int[] dp = new int[V+1];
    //        for(int i=1;i<N+1;i++){
    //            //逆序实现
    //            for(int j=V;j>=weight[i-1];j--){
    //                dp[j] = Math.max(dp[j-weight[i-1]]+value[i-1],dp[j]);
    //            }
    //        }
    //        return dp[V];
    //    }
    public int ZeroOnePack(int V, int N, int[] weight, int[] value){
        int[] dp = new int[V+1];
        for(int i = 1; i < N+1; i++){
            for (int j = V; j >= weight[i-1]; j--) {
                dp[j] = Math.max(dp[j], dp[j-weight[i-1]] + value[i-1]);
            }
        }
        //一个背包的总容量为V,现在有N类物品
        return dp[V];//dp[j]表示前i件物品，重量不超过j的最大价值
    }


    //3、完全背包：每类物品可以无限次装进包内
//    public static int completePack2(int V,int N,int[] weight,int[] value){
//
//        //动态规划
//        int[] dp = new int[V+1];
//        for(int i=1;i<N+1;i++){
//            //顺序实现
//            for(int j=weight[i-1];j<V+1;j++){
//                dp[j] = Math.max(dp[j-weight[i-1]]+value[i-1],dp[j]);
//            }
//        }
//        return dp[V];
//    }
    public int completePack(int V, int N, int[] weight, int[] value){
        int[] dp = new int[V+1];
        for(int i = 1; i < N+1; i++){
            for (int j = weight[i-1]; j < V+1; j++){
                dp[j] = Math.max(dp[j], dp[j - weight[i-1]] + value[i-1]);
            }
        }
        return dp[V];
    }
    //完全背包问题与0-1背包为题很相似，在代码上第二个关于重量循环相反

    public static int mulPack(int[] weight,int[]  value,int[] count,int V, int N) {
//        for(int i = 0 ; i < n ; i++)
//        {
//            for(int j = m ; j >= 0 ; j--)
//            {
//                for(int k = 0 ; k <= p[i] ; k++) //循环每件物品的件数
//                {
//                    if(k*w[i] > j)	//如果放入k件第i件物品的质量超过了容量为j的背包，说明无法放入，直接跳出循环
//                        break;
//                    dp[j] = max(dp[j],dp[j - k*w[i]] + k*c[i]); //动态方程
//                }
//            }
//        }
        int[] dp = new int[V + 1];
        for(int i = 1; i < N+1; i++){
            for (int j = V; j >= 0; j--){
                for (int n = 0; n < count[i]; n++){
                    if(n*weight[i-1] > j) break;
                    dp[j] = Math.max(dp[j], dp[j-n*weight[i-1]] + n*value[i-1]);
                }
            }
        }
        return dp[V];

    }
}
