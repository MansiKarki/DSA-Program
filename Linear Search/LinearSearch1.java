import java.util.*;

public class LinearSearch1 {

    static boolean search(int[] arr,  int key){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search for:");
        int key = sc.nextInt();
        boolean found = search(arr, key);
        if(found){
            System.out.println("Key is present");
        } else {
            System.out.println("Key is absent");
        }
        sc.close();
    }
}
