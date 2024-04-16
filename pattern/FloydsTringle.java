public class FloydsTringle {
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        // outer loop
        for (int line = 1 ; line <= n ; line++) {

            // innner loop
            for(int no= 1 ; no<=line ; no++){
                System.out.print(a);
                a++;
                System.out.print(" ");

            
            }
            System.out.println();
        }

            
        
        
    }
}
