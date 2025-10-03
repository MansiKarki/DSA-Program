import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1,, 12,56};

        Arrays.sort(arr); // sort array in ascending order

        int n = arr.length;
        int largest = arr[n - 1];
        int secondLargest = -1;

        // find element just smaller than largest
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondLargest == -1) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest Element is: " + secondLargest);
        }
    }
}
