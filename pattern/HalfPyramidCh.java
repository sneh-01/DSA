public class HalfPyramidCh {
    public static void main(String[] args) {
        int n = 5;
        
        // outer loop
        for (int line = 1 ; line<= n ; line++){
            // inner loop
            for(int chars = 1 ; chars<=n-line+1 ; chars++){
                System.out.print(chars);

            }
            System.out.println();
        }
    }
    
}
