public class ReverseArray {

    // Swap method to swap elements
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void reverse(int[] arr, int n) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            swap(arr, start, end); // Corrected to use swap method
            start++;
            end--;
        }
    }

    void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]); // Corrected spelling mistake in method name
        }
    }

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray(); // Created instance of ReverseArray
        int[] arr = {1, 2, 3, 4, 5, 6};
        // int[] odd = {23, 31, 7, 1, 23}; // Removed leading zero in integer literal

        // Calling instance methods on the object
        reverseArray.reverse(arr, 6);
       
        reverseArray.printArray(arr, 6); // Corrected spelling mistake in method name
        // Corrected spelling mistake in method name
    }
}
