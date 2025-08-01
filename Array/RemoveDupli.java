import java.util.ArrayList;
import java.util.List;

public class RemoveDupli {
    public static void main(String[] args) {
        int num[] = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            if (i == 0 || num[i] != num[i - 1]) {
                list.add(num[i]);
            }
        }

        // Print the result
        System.out.println("Array after removing duplicates:");
        for (int n : list) {
            System.out.print(n + " ");
        }
    }
}
