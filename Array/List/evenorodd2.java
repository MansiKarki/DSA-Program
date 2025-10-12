import java.util.*;

public class evenorodd2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,15);

        System.out.println("Numbers: " + nums);

        System.out.print("Even: ");
       for (int n = 0; n < nums.size(); n++)
            if (n % 2 == 0)
                System.out.print(n + " ");

        System.out.print("\nOdd: ");
        for (int n =0 ; n < nums.size(); n++)
            if (n % 2 != 0)
                System.out.print(n + " ");
    }
}