import java.util.Scanner;

public class AreaofSquare {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Side");
        int Side = sc.nextInt();
         int AreaofSquar = Side * Side;
         System.out.println("The Area of Square "+ AreaofSquar);
         sc.close();
    }
}
