public class BUyAndSellStock {

    public static int stock(int arr[]){
        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i =0 ; i < arr.length ; i++){
            // selling price is high we aree is profit
            if(buy < arr[i]){
                int profit = arr[i] - buy;

                // find max profit
                maxprofit = Math.max(maxprofit, profit);

            }
            // buying price is high the selling price we got a new low buying price
            else if(buy > arr[i]){
                buy = arr[i];

            }

        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int arr[] = {7 , 1, 5, 3, 6, 4};
        System.out.println(stock(arr));
        
    }
}
