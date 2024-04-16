public class reverseTheNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseNumber(number);

        System.out.println("orignal number :"  + number);
        System.out.println("reverse number :" + reversedNumber);

    }
    
    private static int reverseNumber(int number){
        int reversedNumber = 0;
        while(number != 0){
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 +digit ;
            number /=  10;
        }
        return reversedNumber;

    }
}
