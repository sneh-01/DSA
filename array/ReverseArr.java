public class ReverseArr {

    public static  int reverse(int arr[]){
        int start = 0 , end = arr.length - 1;
        while(start<end){
            int temp = arr[end];
             arr[end] = arr[start];
             arr[start] = temp;

             start ++;
             end --;

        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[] = {2 , 4, 5, 6, 7 };
        reverse(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        
        
    }
}
