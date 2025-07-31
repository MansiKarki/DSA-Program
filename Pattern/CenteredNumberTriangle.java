public class CenteredNumberTriangle {
    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces for centering
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers with space
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println(); // Move to the next line
        }
    }
}
