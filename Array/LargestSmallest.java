public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int largest = arr[0];   // assume first element is largest
        int smallest = arr[0];  // assume first element is smallest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];   // update largest
            }
            if (arr[i] < smallest) {
                smallest = arr[i];  // update smallest
            }
        }

        System.out.println("Largest Element: " + largest);
        System.out.println("Smallest Element: " + smallest);
    }
}

