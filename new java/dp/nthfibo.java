package dp;

import java.util.Arrays;

import stack_queue.stack;

class nthfibo {
    public static void main(String[] args) {
        int n=3;
        int []dp=new int [n+1];
        Arrays.fill(dp,-1);
        // System.out.println(nth(5));
        System.out.println(fib(n,dp));

        
    }
    // tabulation 
    // static int nth(int n){
    //     int []dp=new int [n+1];
    //     dp[0]=0;
    //     dp[1]=1;
    //     for(int i=2;i<=n;i++){
    //         dp[i]=dp[i-1]+dp[i-2];
    //     }
    //     return dp[n];
    // }
    // memoization
    public static int fib(int n,int []dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int f1=fib(n-1,dp);
        int f2=fib(n-2,dp);
        return dp[n]=f1+f2;
    }
    
}