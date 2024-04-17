public class LargestNo {

    public static int largestnumber(int arr[]){
        int no = Integer.MIN_VALUE ;
        for (int i = 0 ; i < arr.length ; i++){
            if(no < arr[i]){
                no = arr[i];
            }

        }
        return no;

    }
    public static void main(String[] args) {
        int arr[] =  { 1, 2, 4, 98, 6, 5};
        System.out.println(largestnumber(arr));
       
        
    }
}
