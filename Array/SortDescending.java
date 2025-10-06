import java.util.Arrays;
import java.util.Collections;

class SortDescending {
    public static void main(String[] args) {
        Integer[] arr = {12, 35, 1, 10, 34, 1};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Descending order: " + Arrays.toString(arr));
    }
}
