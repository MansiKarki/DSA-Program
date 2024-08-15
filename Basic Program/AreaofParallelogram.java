import java.util.Scanner;

public class AreaofParallelogram {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Base of Parallelogram");
        int Base = sc.nextInt();
         System.out.println("Enter the Height of Parallelogram");
         int Height = sc.nextInt();
         int AreaofParallel = Base * Height ;
         System.out.println("The Area of Parallelogram  "+ AreaofParallel);
         sc.close();
    }
}
