public class PrifixSum {
    public static void prefix(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        // int curentsum = 0;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int curentsum =  0;
         

        for (int i = 1; i <arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];

        }

        for (int i = 0; i <arr.length-1; i++){
            for (int j = i+1 ; j < arr.length ; j++){
                
                curentsum = (i==0? prefix[j]:prefix[j] - prefix[i-1]);

                // for (int k = i ; k < j ; k++){
                //     curentsum += arr[k];
                    
                // }
               
                if (curentsum > maxsum){
                    maxsum = curentsum;
                }
                
            }
            
        }
        System.out.println("max sum : " + maxsum);

    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 7, 1};
        prefix(arr);
        
    }
}
