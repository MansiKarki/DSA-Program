public class NumberPatt2 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the inverted pyramid
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
