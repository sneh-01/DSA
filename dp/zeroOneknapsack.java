package dp;

// import GreedyPrograming.knapsack;

public class zeroOneknapsack {
    public static int knapsack(int val[] , int wt[] , int w, int n, int dp[][]){
        if(w==0 || n==0){
            return 0;
        }
        if(dp[n][w] != -1){
            return dp[n][w];
        }

        if(wt[n-1]<=w){
            // include
            int ans1 = val[n-1]+knapsack(val, wt, w-wt[n-1], n-1, dp);

            // exclude
            int ans2 = knapsack(val, wt, w, n-1, dp);
            dp[n][w]= Math.max(ans1 , ans2);
            return dp[n][w];
        }else{
            dp[n][w] = knapsack(val, wt, w, n-1, dp);
            return dp[n][w];
        }
    }

    public static void printdp(int dp[][]){
        for(int i=0 ; i<dp.length   ; i++){
            for(int j =0; j<dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static int knapsacktab(int val[], int wt[], int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];

        // initializaion or base case
        for(int i=0 ; i<dp.length; i++){
            dp[i][0] = 0;
        }
        for(int j =0 ; j<dp[0].length; j++){
            dp[0][j] = 0;
        }

        for(int i=1  ; i<n+1 ;  i++){
            for(int j = 1 ; j<W+1   ; j++){
                int v = val[i-1];
                int w = wt[i-1];
                if(w <= j){
                    // valid
                    int incprofit = v + dp[i-1][j-w];
                    int excprofit = dp[i-1][j];
                    dp[i][j] = Math.max(incprofit, excprofit);
                }else{
                    // excprofit
                    int excprofit = dp[i-1][j];
                    dp[i][j] = excprofit;
                }


            }
        }
        printdp(dp);
        return dp[n][W];
       



    }

    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int w =7;
        int dp[][] = new int[val.length+1][w+1];
        for(int i=0;i<dp.length; i++) {
            for(int j=0;j<dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(knapsack(val, wt, w, val.length, dp));
        System.out.println(knapsacktab(val, wt, w));
    }
    
}
