import java.util.*;

public class ListSumAverage {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.size();

        System.out.println("Num: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Ave: " + average);
    }
}
