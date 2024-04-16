package functions;

public class DtoB {

    public static void decimalToBinary(int n) {
        int decimal = n;
        int binary = 0;
        int power = 0;

        while (n > 0) {
            int remainder = n % 2;
            binary = binary + (remainder * (int) Math.pow(10, power));
            n = n / 2;
            power++;
        }

        System.out.println("Binary equivalent of " + decimal + " is " + binary);
    }

    public static void main(String[] args) {
        // Test the decimalToBinary method with a decimal number (e.g., 7)
        
        decimalToBinary(7); // This will print: Binary equivalent of 7 is 111
    }

}
