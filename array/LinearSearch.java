public class LinearSearch {

    public static void findKey(int number[] , int key){
        int index = -1;
        for (int i = 0  ; i<number.length ; i++){
            if (key == number[i]){
                index = i;
                System.out.println("found " + number[i] + " at index number :  " + index);
            }

        }
    }
    public static void main(String[] args) {
        int number[] = {2 , 4, 6, 8, 10, 45,67,45,10,56};
        int key = 10;

        findKey(number, key);
    }
}
