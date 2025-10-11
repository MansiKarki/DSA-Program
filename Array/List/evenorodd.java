import java.util.*;

public class evenorodd {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Numbers: " + nums);

        System.out.print("Even: ");
        for (int n : nums)
            if (n % 2 == 0)
                System.out.print(n + " ");

        System.out.print("\nOdd: ");
        for (int n : nums)
            if (n % 2 != 0)
                System.out.print(n + " ");
    }
}
