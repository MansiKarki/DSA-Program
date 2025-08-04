public class MANSIPattern {
    public static void main(String[] args) {
        // Define the star patterns for each letter
        String[] m = {
            "M   M", 
            "MM MM", 
            "M M M", 
            "M   M", 
            "M   M"
        };
        String[] a = {
            "  A  ", 
            " A A ", 
            "AAAAA", 
            "A   A", 
            "A   A"
        };
        String[] n = {
            "N   N", 
            "NN  N", 
            "N N N", 
            "N  NN", 
            "N   N"
        };
        String[] s = {
            " SSSS", 
            "S    ", 
            " SSS ", 
            "    S", 
            " SSSS"
        };
        String[] o = {
            " III ", 
            "  I  ", 
            "  I  ", 
            "  I  ", 
            " III "
        };

        // Combine all letter patterns into a 2D array
        String[][] mansiy = {m, a, n, s, o};

        // Print each row of the combined pattern
        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < mansiy.length; i++) {
                System.out.print(mansiy[i][row] + "  "); // Add space between letters
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
