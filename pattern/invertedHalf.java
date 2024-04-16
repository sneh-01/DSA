public class invertedHalf {
    public static void main(String[] args) {
        int n = 4;
        // outer loop
        for (int line = 1 ; line <= n ; line++){

            // space loop
            for (int space = 1 ; space <= n-line ; space++){
                System.out.print(" ");
            }

            // star
            for (int star = 1 ; star <= line ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
