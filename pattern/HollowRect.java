
public class HollowRect {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 5;
        
        for (int line = 1; line <= rows; line++) {
            for (int star = 1; star <= columns; star++) {
                // Check if we are at the first or last row, or first or last column
                if (line == 1 || line == rows || star == 1 || star == columns) {
                    // If yes, print 'X' for the border
                    System.out.print("X");
                } else {
                    // Otherwise, print a space for the hollow part
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}

