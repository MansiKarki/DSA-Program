import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Radius");
        int r = sc.nextInt();
        double pi = 3.14;
         double AreaofCircl = pi * r * r  ;
         System.out.println("The Area of Circle  "+ AreaofCircl);
         sc.close();
    }
}
