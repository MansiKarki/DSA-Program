import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
           Scanner Sc = new Scanner(System.in);
           int cube;
           System.out.println("Enter the number that u want a cube of : ");
           cube = Sc.nextInt();
           int result = cube * cube * cube;
           System.out.println("the Cube of Given no."+ result);
           Sc.close();
    }
}
