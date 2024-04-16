package functions;

public class BtoD {

    public static void binaryconv(int binNUm) {
        int pow = 0;
        int decimal = 0;

        while(binNUm  > 0){
            int lastBin  = binNUm % 10 ;
            decimal = decimal + (lastBin*((int)Math.pow(2, pow)));
            pow++;
            binNUm = binNUm / 10;

        }

        System.out.println("decimal of " + binNUm + " is " + decimal);

        
    }
    public static void main(String[] args) {
        
        binaryconv(101);
        
    }
    
}
