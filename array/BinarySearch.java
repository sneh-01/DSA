public class BinarySearch {

    public static int binarysrc(int arr[] , int key){
        int start = 0, end = arr.length-1;

        while(start <= end){
            int mid = start + end / 2;
            if(arr[mid] == key){
                return mid ; 

            }
            else if(arr[mid] > key){
                end = mid -1 ; 
            }else{
                start = mid + 1;
            }
        }
        return -1;

         



    }
    public static void main(String[] args) {
        int arr[] = {2 , 3, 4, 5, 6, 45 , 30, 23, 34, 56, 78, 89, 77};
        int key =0;
        System.out.println("index for key is : " + binarysrc(arr, key));
        
    }
}
