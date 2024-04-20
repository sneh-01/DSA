public class Pairse {

public static void makepairse(int arr[]){
    
    for(int i = 0; i < arr.length; i++){
        for (int j = i+1 ; j < arr.length ; j++){
            System.out.print("("+ i + ","+ j + ")" );
            
            
        }
        


        
        System.out.println();
    }

}

    public static void main(String[] args) {
        int arr[] = {2 , 3, 4, 5, 6,7};
        makepairse(arr);
        
    }
}
