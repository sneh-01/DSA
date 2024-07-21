package dp;
import java.util.*;

public class climbingStrairs {


    // with recursion     o(2^n)
    // public static int countways(int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     if(n < 0){
    //         return 0;
    //     }
    //     return countways(n-1) + countways(n-2);
    // }

    // with memoization   o(n)
    public static int countways(int  n , int ways[]){
        if(n==0){
            return 1;
        }
        if(n <0){
            return 0;
        }
        if(ways[n] != -1){
            return ways[n];
        }
        ways[n] = countways(n-1, ways) + countways(n-2, ways);
        return ways[n];


    }
    public static int countwaystab(int n ){
        int dp[] = new int[n+1];
        dp[0] = 1;
        
        for(int i=1 ; i<=n ;  i++){
            if(i==1){
                dp[i] = dp[i-1];
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
            
        }
        return dp[n];

    }

    public static void main(String[] args) {
        int n =5;
        int ways[] = new int[n+1];
        Arrays.fill(ways,-1);
        // System.out.println();
        // System.out.println(countways(n, ways));
        System.out.println(countwaystab(n));
        

    }
    
}
