public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // print first 10 numbers
        int first = 0, second = 1;

        System.out.print("Fibonacci Series (Iterative): ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
