<<<<<<< HEAD
=======
import java.util.Scanner;

>>>>>>> 463a65ac1c89ee0956a96ab893ad4bd5b84a714f
public class primeno {
    static boolean isPrime(int n, int i) {
        if (n <= 2) return n == 2;
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        int n = 15;
        System.out.println(isPrime(n, 2) ? "Prime" : "Not Prime");
=======
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isPrime(n, 2) ? "Prime" : "Not Prime");
        sc.close();
>>>>>>> 463a65ac1c89ee0956a96ab893ad4bd5b84a714f
    }
}
