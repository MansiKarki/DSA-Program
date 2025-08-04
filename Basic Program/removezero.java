public class removezero {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 3, 5};

        // Print non-zero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
