public class ZeroOneTriangle {
    public static void main(String[] args) {
        int n = 5;

        // outer loop
        for (int line = 1 ; line<=n ; line++) {
            // inner loop
            for(int i  =1 ; i<=line ; i++){
                if(line % 2 == 0 && i % 2 != 0){
                    System.out.print("0");
                }else if(i % 2 == 0 && line % 2 != 0){
                    System.out.print("0");

                }else{
                    System.out.print("1");
                }
                
            }
            System.out.println();
        }
    }
    
}
