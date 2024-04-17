public class MaxSubArrSum {

    public static void subsum(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        // int curentsum = 0;

        for (int i = 0; i <arr.length-1; i++){
            for (int j = i+1 ; j < arr.length ; j++){
                
                int curentsum = 0;
                for (int k = i ; k < j ; k++){
                    curentsum += arr[k];
                    
                }
                System.out.println(curentsum);
                if (curentsum > maxsum){
                    maxsum = curentsum;
                }
                
            }
            
        }
        System.out.println("max sum : " + maxsum);


    }
    public static void main(String[] args) {
        
        int arr[] = {9,2,3,0,5};
        subsum(arr);
    }
}
