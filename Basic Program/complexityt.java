/**
 * Linear Search: find a target value in an array.
 * Returns its index or –1 if not found.
 *
 * Time Complexity: best = O(1), average/worst = O(n)
 * Space Complexity: O(1) — uses constant extra space
 */
public class complexityt {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;      // Stop early (best case)
            }
        }
        return -1;             // Target not found (worst case)
    }

    public static void main(String[] args) {
        int[] data = {5, 7, 2, 9, 11,12,13,14};
        int key1 = 9;
        int key2 = 3;

        System.out.println("Search 9 in the key =  " + linearSearch(data, key1));  // Expect: 3
        System.out.println("Search 3 → " + linearSearch(data, key2));  // Expect: -1
    }
}
