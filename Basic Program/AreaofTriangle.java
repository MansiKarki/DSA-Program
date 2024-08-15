import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Base of triagnle");
        int Base = sc.nextInt();
         System.out.println("Enter the Height of triagnle");
         int Height = sc.nextInt();
         double AreaofTriang = Base * Height / 2  ;
         System.out.println("The Area of triagnle  "+ AreaofTriang);
         sc.close();
    }
}
