public class removezero {
    public static void main(String[] args) {
        int[] arr = {1,2,3,40,7,8,0,6,0,0};

        // Print non-zero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
