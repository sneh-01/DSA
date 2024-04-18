public class KadnessAlgo {
    public static void kadness(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++){
            cs = cs + arr[i];
            if (cs < 0){
                cs = 0;
            }
            ms = Math.max(ms,cs);

        }

        System.out.println(ms);


    }
    public static void main(String[] args) {
        
        int arr[] = {-2 , -4 , 6 , 0  -1 , 3};
        kadness(arr);
    }
}
